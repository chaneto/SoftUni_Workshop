package AassocIative_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C4_Word_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = Arrays.stream(scanner.nextLine().split(" "))
                .filter(f -> f.length()%2 == 0)
                .toArray(String[]::new);
        for(String out : p){
            System.out.println(out);
        }
    }
}
