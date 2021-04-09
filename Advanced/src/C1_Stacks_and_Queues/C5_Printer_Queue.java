package C1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C5_Printer_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<>();
        String p = scanner.nextLine();
        while (!p.equals("print")){
            if(p.equals("cancel")){
                if(!queue.isEmpty()){
                    System.out.println("Canceled" + " " + queue.poll());
                }else {
                    System.out.println("Printer is on standby");
                }
            }else{
                queue.offer(p);
            }
            p = scanner.next();
        }while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
