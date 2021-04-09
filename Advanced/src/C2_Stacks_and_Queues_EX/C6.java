package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Character> queue = new ArrayDeque<>();
        String part1 = "";
        String part2 = "";
        part1 = p.substring(0,p.length() / 2);
        part2 = p.substring(p.length() / 2,p.length());
        for (int i = 0; i < part1.length(); i++) {
            stack.push(part1.charAt(i));
            queue.offer(part2.charAt(i));
        }while (!stack.isEmpty()){
            if(stack.peek() == '[' && queue.peek() == ']' || stack.peek() == '(' && queue.peek() == ')' ||
                    stack.peek() == '{' && queue.peek() == '}'){
                stack.pop();
                queue.poll();
            }else {
                System.out.println("NO");
                return;
            }

        }
        System.out.println("YES");
    }
}
