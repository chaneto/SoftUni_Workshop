package ATECHMODUL.Attays_Ex;

import java.util.Scanner;

public class C1_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int [] b = new int[a];
        int sum = 0;
        for (int i = 0; i < a; i++) {
            b[i] = Integer.parseInt(scanner.nextLine());
            sum+=b[i];
        }for(int c : b){
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
