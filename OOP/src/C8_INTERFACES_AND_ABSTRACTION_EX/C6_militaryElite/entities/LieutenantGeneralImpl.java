package C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.entities;

import C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.interfaces.LieutenantGeneral;
import C8_INTERFACES_AND_ABSTRACTION_EX.C6_militaryElite.interfaces.Soldier;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public  class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private List<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(PrivateImpl priv) {
        this.privates.add(priv);

    }

    @Override
    public List<PrivateImpl> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
                sb.append(System.lineSeparator()).append("Privates:");
//        for (Private aPrivate : privates) {
//            sb.append(String.format("%n  %s",aPrivate.toString()));
//        }
        this.getPrivates().sort(Comparator.comparingInt(Soldier::getId).reversed());
     this.getPrivates().forEach(p->  sb.append(String.format("%n  %s",p.toString())));
        return sb.toString();
    }
}
