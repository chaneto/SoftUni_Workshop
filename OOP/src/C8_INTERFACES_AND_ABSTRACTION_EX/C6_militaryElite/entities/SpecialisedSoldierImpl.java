package C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.entities;


import C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.enums.Corp;
import C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.interfaces.SpecialisedSoldier;

public  abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private Corp corp;

    protected SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary);
        this.corp=corp;
    }

    @Override
    public Corp getCorp() {
        return this.corp;
    }
}
