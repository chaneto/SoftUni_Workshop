package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Deque<String> stacknum = new ArrayDeque<>();
        Deque<String> stackword = new ArrayDeque<>();
        Deque<String> deque = new ArrayDeque<>();
        String word = "";
        char simbol = 0;
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");
            if(p[0].equals("1")){
                word += p[1];
                stacknum.push(p[0]);
                stackword.push(p[1]);

            }if(p[0].equals("2")){
                int num = Integer.parseInt(p[1]);
                deque.offer(word.substring(word.length() - num));
                word = word.substring(0, word.length() - num);
                stacknum.push(p[0]);

            }if(p[0].equals("3")){
                simbol =  word.charAt(Integer.parseInt(p[1]) - 1);
                System.out.println(simbol);
            }if(p[0].equals("4")){
                if(stacknum.peek().equals("1")){
                    word =  word.replaceAll(stackword.pop(),"");

                }else if(stacknum.peek().equals("2")){
                    word += deque.poll();
                }stacknum.pop();
            }
        }
    }
}
