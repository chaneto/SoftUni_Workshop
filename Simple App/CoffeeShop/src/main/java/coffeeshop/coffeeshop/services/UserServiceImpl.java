package coffeeshop.coffeeshop.services;

import coffeeshop.coffeeshop.models.entities.User;
import coffeeshop.coffeeshop.models.services.UserServiceModel;
import coffeeshop.coffeeshop.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public void register(UserServiceModel userServiceModel) {
        User user = this.mapper.map(userServiceModel, User.class);
        this.userRepository.save(user);
    }

    @Override
    public User findByUsernameAndEmail(String username, String email){
        return this.userRepository.findByUsernameAndEmail(username, email);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return this.userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public List<User> getAllUsers() {
        return this.getAllUsers();
    }
}
