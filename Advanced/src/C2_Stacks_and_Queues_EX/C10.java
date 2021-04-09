package C2_Stacks_and_Queues_EX;

import java.util.*;

public class C10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> out = new ArrayList<>();
        int count = 0;
        int size = 0;
        for (int i = 0; i < in.length; i++) {
            out.add(in[i]);
        }
        while (true){
            count++;
            for (int i = 0; i < out.size() - 1; i++) {
                if(out.get(i) < out.get(i + 1)){
                    deque.offer(out.get(i + 1));
                }
            }if(deque.isEmpty()){
                System.out.println(count - 1);
                break;
            }else {
                size = deque.size();
                for (int i = 0; i < size; i++) {
                    out.remove(deque.poll());
                }
            }
        }
    }
}
