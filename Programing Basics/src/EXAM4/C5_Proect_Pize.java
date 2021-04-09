package EXAM4;

import java.util.Scanner;

public class C5_Proect_Pize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broietapi = Double.parseDouble(scanner.nextLine());
        double parizatochka = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <= broietapi; i++) {
            double tochki = Double.parseDouble(scanner.nextLine());
            if(i % 2 == 0){
                sum += (tochki * 2) * parizatochka;
            }else {
                sum += tochki * parizatochka;
            }

        }
        System.out.printf("The project prize was %.2f lv.",sum);

    }
}
