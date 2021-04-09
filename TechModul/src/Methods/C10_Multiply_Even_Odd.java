package ATECHMODUL.Methods;

import java.util.Scanner;

public class C10_Multiply_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Math.abs(Integer.parseInt(scanner.nextLine()));
         int result = Multiply_Sum_Odd_Even(a);
        System.out.println(result);


    }private static Integer Multiply_Sum_Odd_Even(int a){
      int result = Multiply_Sum_Odd(a) * Multiply_Sum_Even(a);

        return result;
    }
    private static Integer Multiply_Sum_Even(int a){
        int c = 0;
        int sum = 0;
        while (a > 0){
            c = a % 10;
            if(c % 2 == 0){
                sum += c;
            }a /= 10;
        }
        return sum;
    }
    private static Integer Multiply_Sum_Odd(int a){
        int c = 0;
        int sum = 0;
        while (a > 0){
            c = a % 10;
            if(!(c % 2 == 0)){
                sum += c;
            }a /= 10;
        }
        return sum;
    }

}
