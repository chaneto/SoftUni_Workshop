package C4_Encapsulation_Ex.Pizza_Calories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] pizzaInput = scanner.nextLine ().split (" ");
        Pizza pizza = null;
        try {
            pizza = new Pizza (pizzaInput[1], Integer.parseInt (pizzaInput[2]));
        }catch (IllegalArgumentException e){
            System.out.println (e.getMessage ());
            return;
        }
        String[] doughInput = scanner.nextLine ().split (" ");
        try {
            Dough dough = new Dough (doughInput[1], doughInput[2], Double.parseDouble (doughInput[3]));
            pizza.setDough (dough);
        }catch (IllegalArgumentException e){
            System.out.println (e.getMessage ());
            return;
        }while (true){
            String[] toppingInput = scanner.nextLine ().split (" ");
            if(toppingInput[0].equals ("END")){break;}
            try {
                Topping topping = new Topping (toppingInput[1], Integer.parseInt (toppingInput[2]));
                pizza.addTopping (topping);
            }catch (IllegalArgumentException e){
                System.out.println (e.getMessage ());
                return;
            }
        }
        System.out.printf ("Meatless - %.2f",pizza.getOverallCalories ());
    }
}
