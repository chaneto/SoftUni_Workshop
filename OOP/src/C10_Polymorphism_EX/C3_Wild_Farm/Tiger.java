package C10_Polymorphism_EX.C3_Wild_Farm;

public class Tiger extends Feline{
    private String livingRegion;

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super (animalType, animalName, animalWeight, livingRegion);
    }@Override
    public void makeSound(){
        System.out.println ("ROAAR!!!");
    }
}
