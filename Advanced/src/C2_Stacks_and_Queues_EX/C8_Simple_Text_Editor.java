package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C8_Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Deque<String> command = new ArrayDeque<>();
        Deque<String> text = new ArrayDeque<>();
        String out = "";
        for (int i = 0; i < a; i++) {
            String[] cmd = scanner.nextLine().split(" ");
            if(cmd[0].equals("1")){
                out += cmd[1];
                command.push(cmd[0]);
                text.push(cmd[1]);
            }if(cmd[0].equals("2")){
                int length = Integer.parseInt(cmd[1]);
                String textremove = out.substring(out.length() - length,out.length());
                for (int j = 0; j < length; j++) {
                    out = out.substring(0,out.length() - 1);
                }command.push(cmd[0]);
                text.push(textremove);
            }if(cmd[0].equals("3")){
                int index = Integer.parseInt(cmd[1]);
                System.out.println(out.charAt(index - 1));
            }if(cmd[0].equals("4")){
                if(command.peek().equals("1")){
                    for (int j = 0; j < text.peek().length(); j++) {
                        out = out.substring(0,out.length() - 1);
                    }
                    command.pop();
                    text.pop();
                    continue;
                }if(command.peek().equals("2")){
                    out+=text.peek();
                    command.pop();
                    text.pop();
                    continue;
                }
            }
        }
    }
}
