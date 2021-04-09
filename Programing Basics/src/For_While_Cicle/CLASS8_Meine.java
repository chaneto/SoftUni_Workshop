package For_While_Cicle;

import java.util.Scanner;

public class CLASS8_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < p.length() ; i++) {
            char a = p.charAt(i);

            if (a == 'a') {
                sum += 1;
            }
            if (a == 'e') {
                sum += 2;
            }
            if (a == 'i') {
                sum += 3;
            }
            if (a == 'o') {
                sum += 4;
            }
            if (a == 'u') {
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
