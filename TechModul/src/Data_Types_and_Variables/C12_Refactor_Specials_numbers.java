package ATECHMODUL.Data_Types_and_Variables;

import java.util.Scanner;

public class C12_Refactor_Specials_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vhod = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num = 0;
        String p = "";
        boolean name = false;
        for (int i = 1; i <= vhod; i++) {
            num = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }if(name = (sum == 5) || (sum == 7) || (sum == 11)){
                p = "True";
            }else{
                p = "False";
            }
            System.out.printf("%d -> %s%n", num, p);
            sum = 0;
            i = num;
        }

    }
}
