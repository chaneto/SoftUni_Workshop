package example.shopinglist.services;


import example.shopinglist.model.entities.User;
import example.shopinglist.model.services.UserServiceModel;

public interface UserService {

    User findByUsernameAndEmail(String username, String email);

    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);
}
