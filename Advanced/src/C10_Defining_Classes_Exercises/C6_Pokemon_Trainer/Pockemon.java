package C10_Defining_Classes_Exercises.C6_Pokemon_Trainer;

public class Pockemon {
  private String name;
  private String element;
  private int power;

    public Pockemon(String name, String element, int power) {
        this.name = name;
        this.element = element;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
