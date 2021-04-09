package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C10_Poisonous_Plants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Deque<Integer> one = new ArrayDeque<>();
        Deque<Integer> two = new ArrayDeque<>();
        Deque<Integer> tree = new ArrayDeque<>();
        String[] p = scanner.nextLine().split(" ");
        for (int i = 0; i < p.length; i++) {
            int num = Integer.parseInt(p[i]);
            one.offer(num);
            if(one.size() == a){
                break;
            }
        }
        int counter = 0;
        while (true){
            counter++;
            while (!one.isEmpty()){
                if(two.isEmpty()){
                    two.push(one.pop());
                    tree.offer(two.peek());
                }else {
                    int ein = one.peek();
                    int zwei = two.peek();

                    if(one.peek() <= two.peek()){
                        two.push(one.pop());
                        tree.offer(two.peek());
                    }else {
                        two.push(one.pop());
                    }
                }
            }if(two.size() == tree.size()){
                System.out.println(counter - 1);

                return;
            }else {
                two.clear();
            }while (!tree.isEmpty()){
                one.offer(tree.pop());

            }
        }
    }
}
