package C2_Stacks_and_Queues_EX;

import java.util.Scanner;

public class C7_Recursia_FACTORIAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

    }public static int fact(int a){
        if(a == 0){
            return 1;
        }else {
            return  a * fact(a - 1);
        }
    }
}
