package EXAM_EX.EXAM_5;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class C1_Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Deque<Integer>  bombEfectDeque = new ArrayDeque<> ();
        Deque<Integer>  bombStack = new ArrayDeque<> ();
        int daturaBomb = 0;
        int cherryBomb = 0;
        int smokeBomb = 0;
        for (int i = 0; i < 2; i++) {
            int[] input = Arrays.stream (scanner.nextLine ().split (", ")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < input.length; j++) {
                if(i == 0){
                    bombEfectDeque.offer (input[j]);
                }else {
                    bombStack.push (input[j]);
                }
            }
        }while (!(bombEfectDeque.isEmpty () || bombStack.isEmpty ())){
            int currentSum = bombEfectDeque.peek () + bombStack.peek ();
            if(currentSum == 40 || currentSum == 60 || currentSum == 120){
                if(currentSum == 40){
                    daturaBomb++;
                }else if(currentSum == 60){
                    cherryBomb++;
                }else {
                    smokeBomb++;
                }bombEfectDeque.poll ();
                bombStack.pop ();
                if(daturaBomb >= 3 && cherryBomb >= 3 && smokeBomb >= 3){
                    break;
                }
            }else {
                int current = bombStack.pop ();
                bombStack.push (current - 5);
            }
        }if(daturaBomb >= 3 && cherryBomb >= 3 && smokeBomb >= 3){
            System.out.println ("Bene! You have successfully filled the bomb pouch!");
        }else {
            System.out.println ("You don't have enough materials to fill the bomb pouch.");
        }
        System.out.print ("Bomb Effects: ");
        if(bombEfectDeque.isEmpty ()){
            System.out.println ("empty");
        }else {
            String output = "";
            while (!bombEfectDeque.isEmpty ()){
                output += bombEfectDeque.poll () + ", ";
            }output = output.substring (0, output.length () - 2);
            System.out.println (output);
        }
        System.out.print ("Bomb Casings: ");
        if(bombStack.isEmpty ()){
            System.out.println ("empty");
        }else {
            String output = "";
            while (!bombStack.isEmpty ()){
                output += bombStack.pop () + ", ";
            }output = output.substring (0, output.length () - 2);
            System.out.println (output);
        }
        System.out.printf ("Cherry Bombs: %d%nDatura Bombs: %d%nSmoke Decoy Bombs: %d",cherryBomb,daturaBomb,smokeBomb);

    }
}
