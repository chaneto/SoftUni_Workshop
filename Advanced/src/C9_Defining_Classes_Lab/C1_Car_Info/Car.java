package C9_Defining_Classes_Lab.C1_Car_Info;

public class Car {
   private String model;
   private String brand;
   private int horsePower;

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel(){
        return model;
   }

    public String getBrand() {
        return brand;
    }

    public int getHorsePower() {
        return horsePower;
    }
    public void addHoursePower(int add){
        horsePower += add;
    }
    public String carInfo() {
        return String.format("The car is: %s %s - %d HP.",getModel(),getBrand(),getHorsePower());
    }

}
