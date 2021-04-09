package ATECHMODUL.Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class C6_Equal_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int index = -1;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                index = i;break;
            }
            sum+= a[i];
        }if(index == -1){
            System.out.println("Arrays are identical. Sum: " + sum);
        }else{
            System.out.println("Arrays are not identical. Found difference at " + index +  " index.");
        }

    }
}
