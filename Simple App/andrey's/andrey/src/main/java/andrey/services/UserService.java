package andrey.services;

import andrey.model.binding.UserRegisterBindingModel;
import andrey.model.entities.User;

public interface UserService {
    User findByUsernameAndEmail(String username, String email);

    void register(UserRegisterBindingModel userRegisterBindingModel);

    User findByUsernameAndPassword(String username, String password);
}
