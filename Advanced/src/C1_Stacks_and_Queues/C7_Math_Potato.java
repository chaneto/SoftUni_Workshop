package C1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C7_Math_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        int a = Integer.parseInt(scanner.nextLine());
        Deque<String> out = new ArrayDeque<>();
        int counter = 1;
        for(String t : p){
            out.offer(t);
        }
        while (out.size()> 1){
            boolean prosto = true;
            if(counter == 1){
                prosto = false;
            }
            for (int i = 1; i < a; i++) {
                String kinder = out.poll();
                out.offer(kinder);
            }if(counter > 1) {
                for (int j = 2; j < counter; j++) {
                    if (counter % j == 0) {
                        prosto = false;
                    }
                }

            }if(prosto){
                System.out.println("Prime " + out.peek());
            }else {
                System.out.println("Removed " + out.poll());
            }

            counter++;
        }
        System.out.println("Last is " + out.peek());
    }
}
