package ATECHMODUL.Arrays;

import java.util.Scanner;

public class C6_Meine1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] p = scanner.nextLine().split(" ");
        String [] d = scanner.nextLine().split(" ");
        int [] pa = new int[p.length];
        int [] da = new int[d.length];
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            pa[i] = Integer.parseInt(p[i]);
            da[i] = Integer.parseInt(d[i]);
            if(pa[i] != da[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);return;
            }else {
                sum+=pa[i];

            }
        }System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}
