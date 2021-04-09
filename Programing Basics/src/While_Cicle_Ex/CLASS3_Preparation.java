package While_Cicle_Ex;

import java.util.Scanner;

public class CLASS3_Preparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nocenki = Integer.parseInt(scanner.nextLine());
        String name = "";
        int counter = 0;
        int counter1 = 0;
        double total = 0;
        double total1 = 0;
        String last = "";

        while (true) {
             name = scanner.nextLine();
            if(!name.equals("Enough")){
                last = name;}
            else{
                System.out.printf("Average score: %.2f%n", total1);
                System.out.println("Number of problems: " + counter1);
                System.out.println("Last problem: " + last);break;}
            int ocenka = Integer.parseInt(scanner.nextLine());
            counter1++;
            total = total + ocenka;
            total1 = total/counter1;

            if (ocenka <= 4)
                counter++;

            if (counter == nocenki) {
                System.out.printf("You need a break, %d poor grades.", counter);break;
            }




        }

    }
}

