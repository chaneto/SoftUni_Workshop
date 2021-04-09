package AassocIative_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class C5_Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> in = Arrays.stream(scanner.nextLine().split(" "))
                .map(f -> Integer.parseInt(f))
                .sorted((f, f1) -> f1.compareTo(f))
                .collect(Collectors.toList());
        if(in.size() < 3){
            for (int i = 0; i < in.size(); i++) {
                System.out.print(in.get(i) + " ");
            }
        }else {
            for (int i = 0; i < 3; i++) {
                System.out.print(in.get(i) + " ");
            }
        }
    }
}
