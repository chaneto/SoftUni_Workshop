package ATECHMODUL.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C5_Even_Odd_Substraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int[] a =  Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int even = 0, odd = 0;
        for (int i : a) {
            if(i % 2 == 0){
                even += i;
            }else{
                odd += i;
            }
        }
        System.out.println(even - odd);


    }
}
