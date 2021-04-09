package ATECHMODUL.Attays_Ex;

import java.util.Scanner;

public class C7_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        int[] a = new int[p.length];
        int win = 1;
        int counter = 1;
        String vremenno = "";
        for (int i = 0; i < p.length; i++) {
            a[i] = Integer.parseInt(p[i]);
        }
        for (int i = 0; i < p.length - 1; i++) {
            if(a[i] == a[i+1]){
                counter++;
            }if(counter > win) {
                win = counter;
                vremenno = p[i];
            }if(a[i] != a[i+1]){
                counter = 1;
            }
        }
        for (int i = 0; i < win; i++) {
            System.out.print(vremenno + " ");
        }
    }
}
