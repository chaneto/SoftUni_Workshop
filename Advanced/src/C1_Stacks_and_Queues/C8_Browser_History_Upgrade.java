package C1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C8_Browser_History_Upgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> normal = new ArrayDeque<>();
        Deque<String> forward = new ArrayDeque<>();
        while (true){
            String p = scanner.nextLine();
            if(p.equals("Home")){break;}
            if(!p.equals("back") && !p.equals("forward")){
                normal.push(p);
                System.out.println(p);
                forward.clear();
            }else {
                if(p.equals("back")){
                    if(normal.size() > 1){
                        forward.push(normal.pop());
                        System.out.println(normal.peek());
                    }else {
                        System.out.println("no previous URLs");
                    }
                }if(p.equals("forward")){
                    if(forward.size() > 0){
                        System.out.println(forward.peek());
                        normal.push(forward.pop());
                    }else {
                        System.out.println("no next URLs");
                    }
                }
            }
        }
    }
}
