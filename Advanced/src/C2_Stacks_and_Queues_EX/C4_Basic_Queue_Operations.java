package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class C4_Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        int length = Integer.parseInt(p[0]);
        int remove = Integer.parseInt(p[1]);
        int proverka = Integer.parseInt(p[2]);
        boolean yes = false;
        Deque<Integer> out = new ArrayDeque<>();
        String[] in = scanner.nextLine().split(" ");
        for (int i = 0; i < in.length; i++) {
            int num = Integer.parseInt(in[i]);
            out.offer(num);
        }
        for (int i = 0; i < remove; i++) {
            out.poll();
        }if(out.contains(proverka)){
            yes = true;
        }if(yes){
            System.out.println("true");
        }else {
            if(out.size() > 0){
                System.out.println(Collections.min(out));
            }else {
                System.out.println(0);
            }
        }
    }
}
