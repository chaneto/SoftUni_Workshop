package For_While_Cicle_Ex;

import java.util.Scanner;

public class CLASS5_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double pc1 = 0;
        double pc2 = 0;
        double pc3 = 0;
        double pc4 = 0;
        double pc5 = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (double i = 1; i <= a; i++) {
            double b = Double.parseDouble(scanner.nextLine());
            if(b < 200){
               pc1++;

            }else if(b>=200 && b < 400){
                pc2++;

            }else if(b >= 400 && b < 600){
                pc3++;

            }else if(b >= 600 && b < 800){
                pc4++;

            }else if(b >= 800){
                pc5++;

            }

        }p1 += (pc1/a)*100;
        p2 += (pc2/a)*100;
        p3 += (pc3/a)*100;
        p4 += (pc4/a)*100;
        p5 += (pc5/a)*100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%",p5);
    }
}
