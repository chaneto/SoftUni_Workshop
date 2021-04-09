package C10_Polymorphism_EX.C3_Wild_Farm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    protected Animal( String animalType,String animalName, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }
    protected void makeSound(){

    }
    protected void eat(Food food){
        if(getAnimalType ().equals ("Cat")){
            this.foodEaten += food.getQuantity ();
        }else if(getAnimalType ().equals ("Mouse") || getAnimalType ().equals ("Zebra")){
            if(food instanceof Vegetable){
               this.foodEaten += food.getQuantity ();
            }else {
                if(getAnimalType ().equals ("Zebra")){
                    System.out.println ("Zebras are not eating that type of food!");
                }else {
                    System.out.println ("Mice are not eating that type of food!");
                }
            }
        }else if(getAnimalType ().equals ("Tiger")){
            if(food instanceof Meat){
                this.foodEaten += food.getQuantity ();
            }else {
                System.out.println ("Tigers are not eating that type of food!");
            }
        }
    }
}

