package C10_Polymorphism_EX.C3_Wild_Farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Mammal> mammals = new ArrayList<> ();
        while (true){
            String[] inputAnimals = scanner.nextLine ().split (" ");
            if(inputAnimals[0].equals ("End")){
                break;
            }Mammal mammal = null;
            Food food = null;
            String[] inputEat = scanner.nextLine ().split (" ");
            String type = inputAnimals[0];
            String name = inputAnimals[1];
            Double weight = Double.parseDouble (inputAnimals[2]);
            String region = inputAnimals[3];
            String eat = inputEat[0];
            Integer quantyti = Integer.parseInt (inputEat[1]);
            if(eat.equals ("Meat")){
                food = new Meat (quantyti);
            }else if(eat.equals ("Vegetable")){
                food = new Vegetable (quantyti);
            }
            if(type.equals ("Zebra") || type.equals ("Mouse") || type.equals ("Tiger")){
                if(type.equals ("Zebra")){
                    mammal = new Zebra (type, name, weight, region);
                }else if(type.equals ("Mouse")){
                    mammal = new Mouse (type, name, weight, region);
                }else if(type.equals ("Tiger")){
                    mammal = new Tiger (type, name, weight, region);
                }
            }else if(type.equals ("Cat")){
                String breed = inputAnimals[4];
                mammal = new Cat (type, name, weight, region, breed);
            } mammal.makeSound ();
            mammal.eat (food);
            mammals.add (mammal);

        }for(Mammal out: mammals){
            System.out.println (out.toString ());
        }
    }
}
