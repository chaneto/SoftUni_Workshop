package C1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C6_Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        int a = Integer.parseInt(scanner.nextLine());
        Deque<String> out = new ArrayDeque<>();
        for(String t : p){
            out.offer(t);
        }
        while (out.size()> 1){
            for (int i = 1; i < a; i++) {
                String kinder = out.poll();
                out.offer(kinder);

            }
            System.out.println("Removed" + " " + out.poll());
        }
        System.out.println("Last is " + out.peek());
    }
}
