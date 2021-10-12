package coffeeshop.coffeeshop.services;

import coffeeshop.coffeeshop.models.entities.User;
import coffeeshop.coffeeshop.models.services.UserServiceModel;

import java.util.List;

public interface UserService {
    void register(UserServiceModel userServiceModel);

    User findByUsernameAndEmail(String username, String email);

    User findByUsernameAndPassword(String username, String password);

    List<User> getAllUsers();
}
