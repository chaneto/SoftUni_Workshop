package ATECHMODUL.Attays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C7_Max_Sequence_of_Equal_sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 1;
        int maxcounter = 0;
        int numbrer = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] == a[i +1]){
                counter++;
                if(counter > maxcounter){
                    maxcounter = counter;
                    numbrer = a[i];
                }
            }else{
                counter = 1;
            }
        }if(maxcounter == 1){
            System.out.println(a[0]);
        }else{
            for (int i = 0; i < maxcounter; i++) {
                System.out.print(numbrer + " ");
            }

        }

    }
}
