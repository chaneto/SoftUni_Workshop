package C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.entities;

import C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }


    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nCode Number: %s", this.getCodeNumber());
    }
}

