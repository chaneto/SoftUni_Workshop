package ATECHMODUL.Attays_Ex;

import java.util.Scanner;

public class C2_Nue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        String[] d = scanner.nextLine().split(" ");
        for(String a : d ){
            for(String b : p){
                if(a.equals(b)){
                    System.out.print(a + " ");
                }
            }
        }
    }
}
