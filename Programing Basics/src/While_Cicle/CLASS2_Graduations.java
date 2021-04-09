package While_Cicle;

import java.util.Scanner;

public class CLASS2_Graduations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double rezul= 0;
        double broqchclas = 1;
        while(broqchclas<=12){
            double ocenka = Double.parseDouble(scanner.nextLine());
            if(ocenka>=4){
                rezul = rezul+ocenka;
                broqchclas++;
            }

        }
        double total = rezul/12;
        System.out.printf("%s graduated. Average grade: %.2f", name,total);
    }
}
