package C10_Defining_Classes_Exercises.C4_Raw_Data;

public class Car {
     private String carmodel;
     private Dvg dvg;
     private Cargo cargo;
     private Reifen reifen;

    public Car(String carmodel, Dvg dvg, Cargo cargo, Reifen reifen) {
        this.carmodel = carmodel;
        this.dvg = dvg;
        this.cargo = cargo;
        this.reifen = reifen;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public Dvg getDvg() {
        return dvg;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Reifen getReifen() {
        return reifen;
    }
}
