package C11_solidLab.p04_InterfaceSegregation.p02_identity.interfaces;

public class UserImp implements User{
    private String userName;
    private String email;
    private String password;
    private boolean online;

    public UserImp(String userName, String email, String password, boolean online) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.online = online;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
