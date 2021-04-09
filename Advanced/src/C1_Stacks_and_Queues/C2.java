package C1_Stacks_and_Queues;

import java.util.Scanner;
import java.util.Stack;

public class C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        Stack<String> stack = new Stack<>();
        int num = 0;
        int sum = 0;
        for (int i = p.length - 1; i >= 0; i--) {
            stack.push(p[i]);
        }
        while (!stack.empty()){
            if(!stack.peek().equals("+") && !stack.peek().equals("-")){
                sum += Integer.parseInt(stack.pop());
            }else {
                if(stack.peek().equals("+")){
                    stack.pop();
                    sum += Integer.parseInt(stack.pop());
                }else {
                    stack.pop();
                    sum -=Integer.parseInt(stack.pop());
                }
            }
        }
        System.out.println(sum);
    }
}
