package C10_Polymorphism_EX.C3_Wild_Farm;

import java.text.DecimalFormat;

public class Cat extends Feline{
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super (animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }
    public void makeSound(){
        System.out.println ("Meowwww");
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat ("#.##");
        return String.format ("%s[%s, %s, %s, %s, %d]"
                ,getAnimalType (),getAnimalName (),getBreed (),format.format (getAnimalWeight ()),getLivingRegion (),getFoodEaten ());
    }
}
