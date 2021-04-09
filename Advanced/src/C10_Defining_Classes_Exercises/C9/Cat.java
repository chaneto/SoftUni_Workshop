package C10_Defining_Classes_Exercises.C9;

public class Cat {
    private String breeds;
    private String name;
    private double size;

    public Cat(String breeds, String name, double size) {
        this.breeds = breeds;
        this.name = name;
        this.size = size;
    }

    public String getBreeds() {
        return breeds;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }
}
