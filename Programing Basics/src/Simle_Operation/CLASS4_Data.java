package Simle_Operation;

import java.util.Scanner;

public class CLASS4_Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        String f = scanner.nextLine();
        int y = Integer.parseInt(scanner.nextLine());
        String t = scanner.nextLine();
        {
            System.out.printf("You are %s %s, a %d-years old person from %s.",i,f,y,t);
        }
    }
}
