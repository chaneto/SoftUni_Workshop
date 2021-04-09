package C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.interfaces;


import C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.entities.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
