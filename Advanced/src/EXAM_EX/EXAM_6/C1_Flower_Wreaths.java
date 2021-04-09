package EXAM_EX.EXAM_6;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class C1_Flower_Wreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Deque<Integer> rosesDeque = new ArrayDeque<> ();
        Deque<Integer> liliesStack = new ArrayDeque<> ();
        int wreathsCount = 0;
        int stored = 0;
        for (int i = 0; i < 2; i++) {
            int[] input = Arrays.stream (scanner.nextLine ().split (", ")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < input.length; j++) {
            if(i == 0){
                rosesDeque.offer (input[j]);
               }else {
                liliesStack.push (input[j]);
               }
            }
        }while (!(rosesDeque.isEmpty () || liliesStack.isEmpty ())){
            int sum = rosesDeque.peek () + liliesStack.peek ();
            if(sum == 15){
                wreathsCount++;
                rosesDeque.poll ();
                liliesStack.pop ();
            }else if(sum > 15){
                int current = liliesStack.pop ();
                liliesStack.push (current - 2);
            }else {
                stored += sum;
                rosesDeque.poll ();
                liliesStack.pop ();
            }
        }wreathsCount += stored / 15;
        if(wreathsCount >= 5){
            System.out.printf ("You made it, you are going to the competition with %d wreaths!",wreathsCount);
        }else {
            System.out.printf ("You didn't make it, you need %d wreaths more!",5 - wreathsCount);
        }
    }
}
