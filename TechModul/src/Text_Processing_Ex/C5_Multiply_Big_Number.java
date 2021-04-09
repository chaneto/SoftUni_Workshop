package ATECHMODUL.Text_Processing_Ex;

import java.util.Scanner;

public class C5_Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numm = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        if( a == 0){
            System.out.print(0);
            return;
        }String num ="";
        StringBuilder result = new StringBuilder();
        int ostatak = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
          String chisl =String.valueOf(num.charAt(i));
          int chislo = Integer.parseInt(chisl);
          int stoinost = chislo * a + ostatak;
          result.append(stoinost % 10);
          ostatak = stoinost / 10;
        }if(ostatak != 0){
            result.append(ostatak);
        }
        result.reverse();
        System.out.println(result);
    }
}
