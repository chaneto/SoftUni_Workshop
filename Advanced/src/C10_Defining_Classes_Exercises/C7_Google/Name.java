package C10_Defining_Classes_Exercises.C7_Google;

import java.util.Set;

public class Name {
    private String name;
    private Company company;
    private Set<Pockemon> pockemons;
    private Set<Parents> parents;
    private Set<Children> children;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPockemons(Set<Pockemon> pockemons) {
        this.pockemons = pockemons;
    }

    public void setParents(Set<Parents> parents) {
        this.parents = parents;
    }

    public void setChildren(Set<Children> children) {
        this.children = children;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public Set<Pockemon> getPockemons() {
        return pockemons;
    }

    public Set<Parents> getParents() {
        return parents;
    }

    public Set<Children> getChildren() {
        return children;
    }

    public Car getCar() {
        return car;
    }
}
