package andrey.services;

import andrey.model.binding.UserRegisterBindingModel;
import andrey.model.entities.User;
import andrey.repositorues.UserRepository;
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
    public void register(UserRegisterBindingModel userRegisterBindingModel) {
        User user = this.mapper.map(userRegisterBindingModel, User.class);
        this.userRepository.save(user);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return this.userRepository.findByUsernameAndPassword(username, password);
    }
}
