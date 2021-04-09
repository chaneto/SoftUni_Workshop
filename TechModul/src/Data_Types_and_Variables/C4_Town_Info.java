package ATECHMODUL.Data_Types_and_Variables;

import java.util.Scanner;

public class C4_Town_Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.",p,a,b);
    }
}
