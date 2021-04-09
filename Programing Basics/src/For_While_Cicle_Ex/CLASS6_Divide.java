package For_While_Cicle_Ex;

import java.util.Scanner;

public class CLASS6_Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double pc1 = 0;
        double pc2 = 0;
        double pc3 = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (int i = 0; i < a; i++) {
            double b = Double.parseDouble(scanner.nextLine());
            if(b %2 == 0){
                pc1++;
            } if(b %3 == 0){
                pc2++;
            } if(b %4 == 0){
                pc3++;
            }
        }p1 = (pc1/a)*100;
        p2 = (pc2/a)*100;
        p3 = (pc3/a)*100;
        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%",p3);
    }
}
