package C1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C1_Browser_History {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> in = new ArrayDeque<>();
        String p = scanner.nextLine();
        while (!p.equals("Home")){
            if(!p.equals("back")){
                in.push(p);
                System.out.println(p);
            }else {
                if(in.size() <= 1){
                    System.out.println("no previous URLs");
                }else {
                    in.pop();
                    System.out.println(in.peek());
                }
            }p = scanner.nextLine();
        }
    }
}
