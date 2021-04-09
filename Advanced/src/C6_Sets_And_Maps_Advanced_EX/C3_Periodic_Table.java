package C6_Sets_And_Maps_Advanced_EX;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class C3_Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Set<String> in = new TreeSet<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                in.add(input[j]);
            }
        }for(String out : in){
            System.out.print(out + " ");
        }
    }
}
