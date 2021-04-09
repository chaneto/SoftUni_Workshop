package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C1_Reverse_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        Deque<String> result = new ArrayDeque<>();
        for(String out : p){
            result.push(out);
        }for(String out : result){
            System.out.print(result.pop() + " ");
        }
    }
}
