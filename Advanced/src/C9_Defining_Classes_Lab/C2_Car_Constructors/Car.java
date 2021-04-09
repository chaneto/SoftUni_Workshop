package C9_Defining_Classes_Lab.C2_Car_Constructors;

public class Car {
    private String model;
    private String brand;
    private int horsePower;

    public Car(String model){
        this.model = model;
        this.brand = "unknown";
        this.horsePower = -1;
    }
    public Car(String model, String brand){
        this.model = model;
        this.brand = brand;
        this.horsePower = -1;
    }
    public Car(String model, String brand, int horsePower){
        this.model = model;
        this.brand = brand;
        this.horsePower = horsePower;
    }

    public String getBrand()
    {
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getHorsePower(){
        return horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }public void setBrand (String brand){
        this.brand = brand;
    }public void setHorsePower (int horsePower){
        this.horsePower = horsePower;
    }@Override
    public String toString(){
        return String.format("The car is: %s %s - %d HP.",getModel(),getBrand(),getHorsePower());
    }
}
