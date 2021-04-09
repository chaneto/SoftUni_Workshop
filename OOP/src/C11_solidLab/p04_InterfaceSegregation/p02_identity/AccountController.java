package C11_solidLab.p04_InterfaceSegregation.p02_identity;

import C11_solidLab.p04_InterfaceSegregation.p02_identity.interfaces.Account;

public class AccountController {
    private final Account manager;

    public AccountController(Account manager) {
        this.manager = manager;
    }
    public void changePassword(String username, String oldPass,String newPass) {
        this.manager.changePassword(username,oldPass,newPass);
    }
}
