package For_While_Cicle;

import java.util.Scanner;

public class CLASS4_Maxnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        for(int b = 0 ; b < a ; b++){
            int c = Integer.parseInt(scanner.nextLine());
            if(c > max){
                max = c;

            }
        }
        System.out.println(max);
    }
}
