package C10_Polymorphism_EX.C3_Wild_Farm;

public class Zebra extends Mammal{

    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super (animalType, animalName, animalWeight, livingRegion);
    }
    public void makeSound(){
        System.out.println ("Zs");
    }
}
