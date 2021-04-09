package ATECHMODUL.Method_Ex;

import java.util.Scanner;

public class C10_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        top(a);
    }public static void top(int a){
        int broqch = 0;
        for (int i = 0; i < a; i++) {
            String p = "";
            String win = "";
            int sum1 = 0;
            int counter = 0;
            p += i;
            int sum = 0;
            if(p.length() == 1){
                sum1 = Character.getNumericValue(p.charAt(0));
                if(sum1 %8 == 0 && sum1 %2 != 0){
                    System.out.println(sum1);
                }
            }if(p.length() > 1){
                for (int l = 0; l < p.length(); l++) {
                    sum1 = Character.getNumericValue(p.charAt(l));
                    if(sum1 %2 != 0){
                        counter++;
                    }
                    sum += sum1;
                    win+=sum1;
                }
                if(sum %8 == 0 && counter >= 1){
                    System.out.println(win);
                }

            }
        }

    }
}
