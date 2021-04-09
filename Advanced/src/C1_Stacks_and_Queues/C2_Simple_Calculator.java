package C1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C2_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        Deque<Integer> in = new ArrayDeque<>();
        int sum = 0;
        String operation = "";
        for (int i = 0; i < p.length; i++) {
            if(!p[i].equals("+") && !p[i].equals("-")){
                in.push(Integer.parseInt(p[i]));
                if(i == 0){
                    sum += in.peek();
                }if(operation.equals("+")){
                    sum += in.peek();
                    in.pop();
                }if(operation.equals("-")){
                    sum -= in.peek();
                    in.pop();
                }
            }else {
                operation = p[i];
            }
        }in.push(sum);
        System.out.println(in.peek());
    }
}
