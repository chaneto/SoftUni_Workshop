package C1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C3_Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> out = new ArrayDeque<>();
        int a = Integer.parseInt(scanner.nextLine());
        if(a == 0){
            System.out.println(0);
        }
        while (a != 0){
            out.push(a%2);
            a = a / 2;
        }while (!out.isEmpty()){
            System.out.print(out.peek());
            out.pop();
        }
    }
}
