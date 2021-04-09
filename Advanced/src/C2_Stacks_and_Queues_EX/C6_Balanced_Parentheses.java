package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C6_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Deque<Character> Parentheses = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char skoba = input.charAt(i);
            if(skoba == '(' || skoba == '{' || skoba == '['){
                Parentheses.push(skoba);
            }if(skoba == ')' || skoba == '}' || skoba == ']'){
                if(!Parentheses.isEmpty()){
                    if(skoba == ')' && Parentheses.peek() == '('){
                        Parentheses.pop();
                    }else if(skoba == '}' && Parentheses.peek() == '{'){
                        Parentheses.pop();
                    }else if(skoba == ']' && Parentheses.peek() == '['){
                        Parentheses.pop();
                    }else {
                        System.out.println("NO");
                        return;
                    }
                }else {
                    System.out.println("NO");
                    return;
                }

            }
        }if(Parentheses.isEmpty()){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
