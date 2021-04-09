package EXAM_EX.EXAM_2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class C1_Dating_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Deque<Integer> menStack = new ArrayDeque<> ();
        Deque<Integer> womenDeque = new ArrayDeque<> ();
        int count = 0;
        for (int i = 0; i < 2; i++) {
            int[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < input.length; j++) {
                if(i == 0){
                    menStack.push (input[j]);
                }else {
                    womenDeque.offer (input[j]);
                }
            }
        }while (!(menStack.isEmpty () || womenDeque.isEmpty ())){
            int men = menStack.peek();
            int women = womenDeque.peek();
            if(men <= 0 || women <= 0){
                if(men <= 0){
                    menStack.pop ();
                }if(women <= 0){
                    womenDeque.poll ();
                }continue;
            }if(men %25 == 0 || women %25 == 0){
                if(men %25 == 0){
                    while (menStack.pop () %25 == 0){
                        if(menStack.isEmpty ()){
                            print (menStack, womenDeque, count);
                            return;
                        }
                    }men = menStack.peek ();
                } if(women %25 == 0){
                    while (womenDeque.poll () %25 == 0){
                        if(womenDeque.isEmpty ()){
                            print (menStack, womenDeque, count);
                            return;
                        }
                    }
                    women = womenDeque.peek ();
                }

            }if(men == women){
                count++;
                menStack.pop ();
                womenDeque.poll ();
            }else {
                menStack.push (menStack.pop () - 2);
                womenDeque.poll ();
            }
        }
        print (menStack, womenDeque, count);
    }

    private static void print(Deque<Integer> menStack, Deque<Integer> womenDeque, int count) {
        System.out.println ("Matches: " + count);
        System.out.print ("Males left: ");
        if(menStack.isEmpty ()){
            System.out.println ("none");
        }else {
            String output = "";
            while (!menStack.isEmpty ()){
                output += menStack.pop () + ", ";
            }output = output.substring (0, output.length () - 2);
            System.out.println (output);
        }
        System.out.print ("Females left: ");
        if(womenDeque.isEmpty ()){
            System.out.println ("none");
        }else {
            String output = "";
            while (!womenDeque.isEmpty ()){
                output += womenDeque.poll () + ", ";
            }output = output.substring (0, output.length () - 2);
            System.out.println (output);
        }

    }
}
