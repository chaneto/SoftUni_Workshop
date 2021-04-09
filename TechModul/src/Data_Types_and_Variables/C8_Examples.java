package ATECHMODUL.Data_Types_and_Variables;

import java.util.Scanner;

public class C8_Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        int b = (int)a;
        if(b >= 65 & b <= 90 ){
            System.out.printf("upper-case");
        }
        if(b >= 97 & b <= 122){
            System.out.printf("lower-case");
        }
    }
}
