package EXAM_EX.EXAM_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class C1_Loot_box {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Deque<Integer> dequelootbox = new ArrayDeque<> ();
        Deque<Integer> stacklootbox = new ArrayDeque<> ();
        int sum = 0;
        for (int i = 0; i < 2; i++) {
           int[] input = Arrays.stream (scanner.nextLine ().split ("\\s+")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < input.length; j++) {
                if(i == 0){
                    dequelootbox.offer (input[j]);
                }else {
                    stacklootbox.push (input[j]);
                }
            }

        }while (!(dequelootbox.isEmpty () || stacklootbox.isEmpty ())){
            int currentsum = dequelootbox.peek () + stacklootbox.peek ();
            if(currentsum %2 == 0){
                dequelootbox.poll ();
                stacklootbox.pop ();
                sum += currentsum;
            }else {

                dequelootbox.offer (stacklootbox.pop ());
            }
        }if(dequelootbox.isEmpty ()){
            System.out.println ("First lootbox is empty");
        }else {
            System.out.println ("Second lootbox is empty");
        }if(sum >= 100){
            System.out.println ("Your loot was epic! Value: " + sum);
        }else {
            System.out.println ("Your loot was poor... Value: " + sum);
        }
    }
}
