package C11_solidLab.p04_InterfaceSegregation.p02_identity;

import C11_solidLab.p04_InterfaceSegregation.p02_identity.interfaces.Account;
import C11_solidLab.p04_InterfaceSegregation.p02_identity.interfaces.User;
import C11_solidLab.p04_InterfaceSegregation.p02_identity.interfaces.UserImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountManager implements Account {
    private int minRequiredPasswordLength;
    private int maxRequiredPasswordLength;
    private Map<String, UserImp> users;

    public AccountManager( int minRequiredPasswordLength, int maxRequiredPasswordLength) {
        this.minRequiredPasswordLength = minRequiredPasswordLength;
        this.maxRequiredPasswordLength = maxRequiredPasswordLength;
        this.users = new HashMap<> ();
    }
    public void addUsers(UserImp user){
        if(users.containsKey (user.getUserName ())){
            System.out.println ("This Username is Busy");
        }else {
            users.put (user.getUserName (), user);
        }
    }
    @Override
    public int getMinRequiredPasswordLength() {
        return this.minRequiredPasswordLength;
    }
    @Override
    public int getMaxRequiredPasswordLength() {
        return this.maxRequiredPasswordLength;
    }
    @Override
    public void register(UserImp userImp) {
      if(!users.containsKey (userImp.getUserName ())){
          if(userImp.getPassword ().length () >= this.minRequiredPasswordLength
                  && userImp.getPassword ().length () <= this.maxRequiredPasswordLength){
              users.put (userImp.getUserName (), userImp);
              System.out.println ("Register is complete");
          }else {
              System.out.println ("Password is Lang other Small");
          }
      }else {
          System.out.println ("UserName is Exist");
      }
    }
    @Override
    public void login(String userName, String password) {
        if(users.containsKey (userName ) &&
                users.get (userName).getPassword ().equals (password)){
            System.out.println ("You Login");
        }else {
            System.out.println ("Incorrect Password other Username");
        }
    }
    @Override
    public void changePassword(String username, String oldPass, String newPass) {
        if(users.get (username).getPassword ().equals (oldPass)){
            users.get (username).setPassword (newPass);
            System.out.println ("Password is change");
        }else {
            System.out.println ("Incorrect old Password");
        }
    }
    @Override
    public Map<String,UserImp> getAllUsersOnline() {
        Map<String, UserImp> online = new HashMap<> ();
        for(Map.Entry<String, UserImp> out : users.entrySet ()){
            if(out.getValue ().isOnline ()){
            online.put (out.getKey (),out.getValue ());
            }
        }return online;
    }
    @Override
    public Map<String, UserImp> getAllUsers() {
        return users;
    }
    @Override
    public User getUserByName(String name) {
        return users.get (name);
    }
}
