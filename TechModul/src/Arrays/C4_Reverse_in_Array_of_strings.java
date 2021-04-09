package ATECHMODUL.Arrays;

import java.util.Scanner;

public class C4_Reverse_in_Array_of_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        for (int i = 0; i < p.length / 2; i++) {
            String temp = p[i];
            p[i] = p[p.length - 1 - i];
            p[p.length - 1 - i] = temp;

        }
        System.out.println(String.join(" ",p));
        for (String word: p){
            System.out.print(word + " ");
        }
    }

}
