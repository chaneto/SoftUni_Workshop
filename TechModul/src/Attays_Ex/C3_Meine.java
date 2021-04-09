package ATECHMODUL.Attays_Ex;

import java.util.Scanner;

public class C3_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String [] red1 = new String[a];
        String [] red2 = new String[a];
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");
            if(i%2 == 0){
                red1[i] = p[0];
                red2[i] = p[1];
            }else {
                red1[i] = p[1];
                red2[i] = p[0];
            }
        }for(String out : red1){
            System.out.print(out + " ");
        }
        System.out.println();
        for(String out : red2){
            System.out.print(out + " ");
        }
    }
}
