package C10_Defining_Classes_Exercises.C7_Google;

public class Pockemon {
   private String pokname;
   private String poktype;

    public Pockemon(String name, String type) {
        this.pokname = name;
        this.poktype = type;
    }

    public String getPokname() {
        return pokname;
    }

    public String getPoktype() {
        return poktype;
    }
}
