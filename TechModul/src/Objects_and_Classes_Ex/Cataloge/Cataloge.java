package ATECHMODUL.Objects_and_Classes_Ex.Cataloge;

public class Cataloge {
   private String type;
   private String model;
   private String color;
   private Double horse;


    public Cataloge(String type, String model, String color, Double horse) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horse = horse;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Double getHorse() {
        return horse;
    }

    public String toString(){
        String out = String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f",this.type,this.model,this.color,this.horse);
        return out;
    }
}
