package C10_Polymorphism_EX.C3_Wild_Farm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    protected Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super (animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat ("#.##");
        return String.format ("%s[%s, %s, %s, %d]"
                ,getAnimalType (),getAnimalName (),format.format (getAnimalWeight ()),getLivingRegion (),getFoodEaten ());
    }

}
