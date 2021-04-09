package ATECHMODUL.Attays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C6_Equal_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int left = 0;
        int right = 0;
        int counter = 0;
        for (int i = 0; i < in.length; i++) {
            for (int j = i + 1; j < in.length; j++) {
                right+=in[j];
            }
            for (int j = 0; j < i; j++) {
                left+=in[j];
            }if(right == left){
                System.out.println(i);
                counter++;
            }
            right = 0;
            left = 0;

        }if(counter == 0){
            System.out.println("no");
        }
    }
}
