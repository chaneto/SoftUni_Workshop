package EXAM;

import java.util.Scanner;

public class TASK6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budjet = Integer.parseInt(scanner.nextLine());
        int ascisum = 0;
        while (true){
           String p = scanner.nextLine();
           if(p.equals("Stop")){System.out.printf("Money left: %d",budjet);break;}
            for (int i = 0; i < p.length(); i++) {
                ascisum += p.charAt(i);
            }if(budjet <= ascisum){
                System.out.println("Not enough money!" );{break;}
            }
            if(budjet > ascisum){
                budjet -= ascisum;
                System.out.println("Item successfully purchased!");
                ascisum = 0;
            }
        }

    }
}
