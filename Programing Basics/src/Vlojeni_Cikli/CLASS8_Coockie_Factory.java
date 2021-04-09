package Vlojeni_Cikli;

import java.util.Scanner;

public class CLASS8_Coockie_Factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean eggs = false;
        boolean flour = false;
        boolean sugar = false;
        for (int i = 1; i <= a ; i++) {
            String p = scanner.nextLine();

            while (!(p.equals("Bake!"))) {
                if (p.equals("eggs")) {
                    eggs = true;
                } else if (p.equals("flour")) {
                    flour = true;
                } else if (p.equals("sugar")) {
                    sugar = true;
                }

                p = scanner.nextLine();

            }if(eggs && flour && sugar){
                eggs = false;
                flour = false;
                sugar = false;
                System.out.printf("Baking batch number %d...%n",i);
            }else {
                i--;
                System.out.println("The batter should contain flour, eggs and sugar!");
            }

        }
    }
}
