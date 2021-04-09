package C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.entities;

import C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {

    private double salary;
    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary=salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Salary: %.2f", this.getSalary());
    }
}
