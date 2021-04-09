package C11_solidLab.p04_InterfaceSegregation.p02_identity;

import C11_solidLab.p04_InterfaceSegregation.p02_identity.interfaces.UserImp;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager (4, 8);
        UserImp userImp = new UserImp ("Chan", "Chaneto_80@", "gringo", true);
        System.out.println (userImp.getEmail ());
        System.out.println (userImp.getPassword ());
        System.out.println (userImp.isOnline ());
        accountManager.login ("Chan", "gringo");
        accountManager.register (userImp);
        accountManager.login ("Chan", "gringo");
        userImp.setOnline (false);
        System.out.println (userImp.isOnline ());
        accountManager.changePassword ("Chan","tttttt", "utorrrr");
        accountManager.changePassword ("Chan","gringo", "bingo");
        accountManager.login ("Chan", "gringo");
        accountManager.login ("Chan", "bingo");
        UserImp userImpOne = new UserImp ("Chan", "Chaneto_80@", "gri", true);
        accountManager.register (userImpOne);
        UserImp userImpTwo = new UserImp ("Man", "Chaneto_80@", "gri", true);
        accountManager.register (userImpTwo);
        UserImp userImpThree = new UserImp ("Man", "Chaneto_80@", "patka", true);
        accountManager.register (userImpThree);
        System.out.println (userImpThree.isOnline ());
        System.out.println (userImpTwo.isOnline ());
        System.out.println (userImp.isOnline ());
    }
}
