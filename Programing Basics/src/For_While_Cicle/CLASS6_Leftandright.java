package For_While_Cicle;

import java.util.Scanner;

public class CLASS6_Leftandright {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            left += b;

        }for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            right += b;
        }if(left == right){
            System.out.println("Yes, sum = " + left);
        }else {
            System.out.println("No, diff = " + Math.abs(left-right));
        }

    }
}
