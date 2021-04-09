package ATECHMODUL.Methods;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Math.abs(Integer.parseInt(scanner.nextLine()));
        int sum = Multiply_sum_odd(a);
        System.out.println(sum);

    }public static int Multiply_sum_odd(int a) {
        int sum = 0;
        int vremeva = 0;
        int even = 0;
        int odd = 0;
        while (a > 0) {
            vremeva = a % 10;
            if (vremeva % 2 == 0) {
                even += vremeva;
            } else {
                odd += vremeva;
            }
            a /= 10;
        }sum = odd * even;
        return sum;
    }
}
