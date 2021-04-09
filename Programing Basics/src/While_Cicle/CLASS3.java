package While_Cicle;

import java.util.Scanner;

public class CLASS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double o = 0;
        double rezul= 0;
        double broqchclas = 1;
        while(broqchclas<=12){
            double ocenka = Double.parseDouble(scanner.nextLine());
            if(ocenka>=4){
                broqchclas++;
                rezul = rezul+ocenka;
            }else if(ocenka<4)o=o+1;{
                if(o==2)
                    System.out.printf("%s has been excluded at %.0f grade.",name, broqchclas);
                }


        }
        double total = rezul/12;
        System.out.printf("%s graduated. Average grade: %.2f", name,total);


    }
}
