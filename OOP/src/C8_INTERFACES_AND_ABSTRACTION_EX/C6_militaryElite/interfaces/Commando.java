package C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.interfaces;

import C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.entities.Mission;

import java.util.Collection;

public interface Commando {
     void addMission(Mission mission);
     Collection<Mission> getMissions();
}
