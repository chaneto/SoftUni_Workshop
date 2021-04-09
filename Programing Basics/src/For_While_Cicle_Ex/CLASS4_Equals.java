package For_While_Cicle_Ex;

import java.util.Scanner;

public class CLASS4_Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int lastsum = 0;
        int diff = 0;
        for (int i = 0; i < a ; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());
             int sum = b + c;
            if(i > 0){
                diff = Math.abs(lastsum - sum);

            }lastsum = sum;

        }if(diff == 0) {
            System.out.println("Yes, value = " + lastsum);
        }else {
            System.out.println("No, maxdiff = " + diff);
        }

    }
}
