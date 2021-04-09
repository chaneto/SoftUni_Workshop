package For_While_Cicle;

import java.util.Scanner;

public class CLASS7_Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;
        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            if(i %2 == 0){
                even += b;

            }else {
                odd += b;
            }

        }if(odd == even){
            System.out.println("Yes");
            System.out.println("Sum = " + odd);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(odd - even));
        }
    }
}
