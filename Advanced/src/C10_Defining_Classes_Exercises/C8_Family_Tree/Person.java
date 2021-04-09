package C10_Defining_Classes_Exercises.C8_Family_Tree;

public class Person {
    private  String name;
    private String date;

    public Person(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
