package ATECHMODUL.Method_Ex;

import java.util.Scanner;

public class C5_add_subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        subtract(add(a,b),c);
    }public static Integer add(int a, int b){
        int plus = a + b;
        return plus;
    }public static Integer subtract(int plus, int c){
        int minus = plus - c;
        System.out.println(minus);
        return minus;
    }
}