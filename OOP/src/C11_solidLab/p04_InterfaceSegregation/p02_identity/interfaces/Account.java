package C11_solidLab.p04_InterfaceSegregation.p02_identity.interfaces;

import java.util.List;
import java.util.Map;

public interface Account {

    int getMinRequiredPasswordLength();

    int getMaxRequiredPasswordLength();

    void register(UserImp userImp);

    void login(String userName, String password);

    void changePassword(String username, String oldPass, String newPass);

    Map<String,UserImp> getAllUsersOnline();

    Map<String,UserImp> getAllUsers();

    User getUserByName(String name);
}
