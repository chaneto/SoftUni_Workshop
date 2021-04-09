package C1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C4_Matching_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        String p = scanner.nextLine();
        String t = "";
        int one = 0;
        int two = 0;
        for (int i = 0 ; i < p.length(); i++) {
            if(p.charAt(i) == '('){
                stack.push(i);
            }
            if(p.charAt(i) == ')'){
                System.out.println(p.substring(stack.pop(), i + 1));
            }
        }

    }
}
