package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C9_Infix_to_Postfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        Deque<String> out = new ArrayDeque<>();
        Deque<String> znaci = new ArrayDeque<>();
        for (int i = 0; i < p.length; i++) {
            String ttt = p[i];
            if(Character.isDigit(p[i].charAt(0)) || Character.isLetter(p[i].charAt(0))){
                out.offer(p[i]);
            }else{
                if(znaci.isEmpty()){
                    znaci.push(p[i]);
                }else {
                    if(p[i].equals("+") || p[i].equals("-")){
                        if(znaci.peek().equals("(")){
                            znaci.push(p[i]);
                        }else {
                            out.offer(znaci.pop());
                            znaci.push(p[i]);
                        }
                    }if(p[i].equals("*") || p[i].equals("/")){
                        if(znaci.peek().equals("*") || znaci.peek().equals("/")){
                            out.offer(znaci.pop());
                            znaci.push(p[i]);
                        }else {
                            znaci.push(p[i]);
                        }
                    }if(p[i].equals("(")){
                        znaci.push(p[i]);
                    }if(p[i].equals(")")){
                        while (!znaci.peek().equals("(")){
                            out.offer(znaci.pop());
                        }znaci.pop();
                    }
                }
            }

        }
        while (!out.isEmpty()){
            System.out.print(out.pop() + " ");
        }while (!znaci.isEmpty()){
            System.out.print(znaci.pop() + " ");
        }
    }
}
