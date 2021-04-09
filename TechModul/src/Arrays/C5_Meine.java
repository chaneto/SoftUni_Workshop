package ATECHMODUL.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C5_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] p = scanner.nextLine().split(" ");
        int [] a = new int[p.length];
        int chetni = 0;
        int nechetni = 0;
        for (int i = 0; i < a.length ; i++) {
            a[i] = Integer.parseInt(p[i]);

        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] %2 == 0){
                chetni+=a[i];
            }else {
                nechetni+=a[i];
            }
        }
        System.out.println(chetni - nechetni);
    }
}
