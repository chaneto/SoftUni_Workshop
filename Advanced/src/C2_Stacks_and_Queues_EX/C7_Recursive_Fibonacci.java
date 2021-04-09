package C2_Stacks_and_Queues_EX;

import java.util.Scanner;

public class C7_Recursive_Fibonacci {
    private static long[] memory;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        memory  = new long[a + 1];
        System.out.println(fib(a));
    }
    private static long fib(int a) {
        if(a <= 2){
            return a;
        }if(memory[a] != 0){
            return memory[a];
        }
        return memory[a]  = fib(a - 1) + fib(a - 2);
    }

}
