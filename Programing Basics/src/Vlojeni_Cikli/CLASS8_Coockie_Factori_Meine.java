package Vlojeni_Cikli;

import java.util.Scanner;

public class CLASS8_Coockie_Factori_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean sugar = false;
        boolean eggs = false;
        boolean flour = false;
        while (a > counter) {
            String p = scanner.nextLine();
            if (p.equals("sugar")) {
                sugar = true;

            } else if (p.equals("eggs")) {
                eggs = true;
            } else if (p.equals("flour")) {
                flour = true;
            }if(sugar && eggs && flour && p.equals("Bake!")){
                counter++;
                sugar = false;
                flour = false;
                eggs = false;
                System.out.printf("Baking batch number %d...%n",counter);
            }else if(p.equals("Bake!")){
                System.out.printf("The batter should contain flour, eggs and sugar!%n");
            }
        }
    }
}
