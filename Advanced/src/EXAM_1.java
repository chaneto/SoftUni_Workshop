import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class EXAM_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Deque<Integer> firstBoxDeque = new ArrayDeque<> ();
        Deque<Integer> secondBoxStack = new ArrayDeque<> ();
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            int[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < input.length; j++) {
                if(i == 0){
                    firstBoxDeque.offer (input[j]);
                }else {
                    secondBoxStack.push (input[j]);
                }
            }
        }while (!(firstBoxDeque.isEmpty () || secondBoxStack.isEmpty ())){
            int currentSum = firstBoxDeque.peek () + secondBoxStack.peek ();
            if(currentSum %2 == 0){
                sum += currentSum;
                firstBoxDeque.poll ();
                secondBoxStack.pop ();
            }else {
                firstBoxDeque.offer (secondBoxStack.pop ());
            }
        }if(firstBoxDeque.isEmpty ()){
            System.out.println ("First magic box is empty.");
        }if(secondBoxStack.isEmpty ()){
            System.out.println ("Second magic box is empty.");
        }if(sum >= 90){
            System.out.printf ("Wow, your prey was epic! Value: %d",sum);
        }else {
            System.out.printf ("Poor prey... Value: %d",sum);
        }
    }
}
