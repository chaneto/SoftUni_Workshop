package C10_Defining_Classes_Exercises.C5_Car_Salesman;

    public class Engine {
    private String model;
    private String power;
    private int dispiacement;
    private String efect;

    public Engine(String model, String power){
        this.model = model;
        this.power = power;
        this.dispiacement = 0;
        this.efect = "n/a";
    }
    public Engine(String model, String power, int dispiacement){
        this(model,power);
        this.dispiacement = dispiacement;
        this.efect = "n/a";
    }

    public Engine(String model,String power,String efect){
        this(model,power);
        this.dispiacement = 0;
        this.efect = efect;
    }

        public Engine(String model, String power, int dispiacement,String efect){
            this.model = model;
            this.power = power;
            this.dispiacement = dispiacement;
            this.efect = efect;
        }

    public String getModel() {
        return model;
    }


    public String getPower() {
        return power;
    }


    public int getDispiacement() {
        return dispiacement;
    }


    public String getEfect() {
        return efect;
    }

}
