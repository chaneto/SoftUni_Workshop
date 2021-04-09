package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class C3_Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Deque<Integer> out = new ArrayDeque<>();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");
            if(p[0].equals("1")){
                int num = Integer.parseInt(p[1]);
                out.push(num);
            }if(p[0].equals("2")){
                if(!out.isEmpty()){
                    out.pop();
                }
            }if(p[0].equals("3")){
                System.out.println(Collections.max(out));
            }
        }
    }
}
