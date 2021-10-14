package example.shopinglist.services;

import example.shopinglist.model.entities.User;
import example.shopinglist.model.services.UserServiceModel;
import example.shopinglist.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public User findByUsernameAndEmail(String username, String email) {
        return this.userRepository.findByUsernameAndEmail(username, email);
    }

    @Override
    public void registerUser(UserServiceModel userServiceModel) {
        User user = this.mapper.map(userServiceModel, User.class);
        this.userRepository.save(user);
    }

    @Override
    public UserServiceModel findByUsernameAndPassword(String username, String password) {
        User user = this.userRepository.findByUsernameAndPassword(username, password);
        UserServiceModel userServiceModel = new UserServiceModel();
        if(user != null){ userServiceModel = this.mapper.map(user, UserServiceModel.class);
        return userServiceModel;
        }else {
            userServiceModel = null;
            return userServiceModel;
        }
    }
}
