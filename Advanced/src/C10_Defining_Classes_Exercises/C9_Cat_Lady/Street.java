package C10_Defining_Classes_Exercises.C9_Cat_Lady;

public class Street {
    private String poroda;
    private String name;
    private double age;

    public Street(String poroda, String name, double age) {
        this.poroda = poroda;
        this.name = name;
        this.age = age;
    }


    public String getPoroda() {
        return poroda;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }
}
