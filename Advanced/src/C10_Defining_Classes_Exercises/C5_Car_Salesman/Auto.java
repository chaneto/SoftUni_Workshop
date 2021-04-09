package C10_Defining_Classes_Exercises.C5_Car_Salesman;

import C10_Defining_Classes_Exercises.C5_Car_Salesman.Engine;

public class Auto {
  private String automodel;
  private Engine engine;
  private int wieght;
  private String color;

    public Auto(String automodel, Engine engine) {
        this.automodel = automodel;
        this.engine = engine;
        this.wieght = 0;
        this.color = "n/a";
    }
    public Auto(String automodel, Engine engine, int wieght) {
        this.automodel = automodel;
        this.engine = engine;
        this.wieght = wieght;
        this.color = "n/a";
    }
    public Auto(String automodel, Engine engine, String color) {
        this.automodel = automodel;
        this.engine = engine;
        this.wieght = 0;
        this.color = color;
    }public Auto(String automodel, Engine engine, int wieght,String color) {
        this.automodel = automodel;
        this.engine = engine;
        this.wieght = wieght;
        this.color = color;
    }

    public String getAutomodel() {
        return automodel;
    }


    public Engine getEngine() {
        return engine;
    }


    public int getWieght() {
        return wieght;
    }


    public String getColor() {
        return color;
    }

}
