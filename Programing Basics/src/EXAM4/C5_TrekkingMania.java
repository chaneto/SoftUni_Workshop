package EXAM4;

import java.util.Scanner;

public class C5_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        double total = 0;
        for (int i = 0; i < a; i++) {
            double b = Double.parseDouble(scanner.nextLine());
            total+=b;
            if(b < 6){
                musala += b;
            }if(b >= 6 && b < 13){
                monblan += b;
            }if(b >= 13 && b < 26 ){
                kilimandjaro += b;
            }if(b >= 26 && b < 41){
                k2 += b;
            }if(b >= 41){
                everest += b;
            }

        }
        System.out.printf("%.2f%%%n",musala / total * 100);
        System.out.printf("%.2f%%%n",monblan / total * 100);
        System.out.printf("%.2f%%%n",kilimandjaro / total * 100);
        System.out.printf("%.2f%%%n",k2 / total * 100);
        System.out.printf("%.2f%%",everest / total * 100);
    }
}
