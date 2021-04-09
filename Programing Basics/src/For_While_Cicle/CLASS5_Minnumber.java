package For_While_Cicle;

import java.util.Scanner;

public class CLASS5_Minnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a ; i++) {
            int c = Integer.parseInt(scanner.nextLine());
            if(c < min) {
                min = c;
            }

        }System.out.println(min);
    }
}
