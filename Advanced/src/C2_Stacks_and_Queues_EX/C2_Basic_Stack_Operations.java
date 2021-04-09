package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class C2_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        int length = Integer.parseInt(p[0]);
        int remove = Integer.parseInt(p[1]);
        int proverkA = Integer.parseInt(p[2]);
        boolean yes = false;
        String[] in = scanner.nextLine().split("\\s+");
        Deque<Integer> steck = new ArrayDeque<>();
        for (int i = 0; i < in.length; i++) {
            int num = Integer.parseInt(in[i]);
            steck.push(num);
        }
        for (int i = 0; i < remove; i++) {
            steck.pop();
        }if(steck.contains(proverkA)){
            yes = true;
        }if(yes){
            System.out.println("true");
        }else {
            if(!steck.isEmpty()){
                System.out.println(Collections.min(steck));
            }else {
                System.out.println(0);
            }
        }
    }
}
