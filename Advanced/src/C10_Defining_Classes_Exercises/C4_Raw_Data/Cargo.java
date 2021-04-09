package C10_Defining_Classes_Exercises.C4_Raw_Data;

public class Cargo {
    public int weight;
    public String tupe;

    public Cargo(int weight, String tupe) {
        this.weight = weight;
        this.tupe = tupe;
    }

    public int getWeight() {
        return weight;
    }

    public String getTupe() {
        return tupe;
    }
}
