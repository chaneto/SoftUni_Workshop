package C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.interfaces;

import C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.entities.PrivateImpl;

import java.util.List;

public interface LieutenantGeneral {

     void addPrivate(PrivateImpl priv);
     List<PrivateImpl> getPrivates();
}
