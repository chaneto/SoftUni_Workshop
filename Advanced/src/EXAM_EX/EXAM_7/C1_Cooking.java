package EXAM_EX.EXAM_7;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class C1_Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Deque<Integer> liquidsDeque = new ArrayDeque<> ();
        Deque<Integer> ingredientsStack = new ArrayDeque<> ();
        int bread = 0;
        int cake = 0;
        int pastry = 0;
        int fruit_Pie = 0;
        for (int i = 0; i < 2; i++) {
            int[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < input.length; j++) {
                if(i == 0 ){
                    liquidsDeque.offer (input[j]);
                }else {
                    ingredientsStack.push (input[j]);
                }
            }
        }while (!(liquidsDeque.isEmpty () || ingredientsStack.isEmpty ())){
            int ingredientsCurrent = ingredientsStack.peek ();
            int sum = liquidsDeque.poll () + ingredientsCurrent;
            if(chek (sum)){
                if(sum == 25){
                    bread++;
                }else if(sum == 50){
                    cake++;
                }else if(sum == 75){
                    pastry++;
                }else {
                    fruit_Pie++;
                }
                ingredientsStack.pop ();
            }else {
                ingredientsStack.pop ();
                ingredientsStack.push (ingredientsCurrent + 3);
            }
        }
        print (liquidsDeque, ingredientsStack, bread, cake, pastry, fruit_Pie);
    }

    private static void print(Deque<Integer> liquidsDeque, Deque<Integer> ingredientsStack, int bread, int cake, int pastry, int fruit_Pie) {
        if(Wohoo (bread,cake,pastry,fruit_Pie)){
            System.out.println ("Wohoo! You succeeded in cooking all the food!");
        }else {
            System.out.println ("Ugh, what a pity! You didn't have enough materials to to cook everything.");
        }
        System.out.print ("Liquids left: ");
        if(liquidsDeque.isEmpty ()){
            System.out.println ("none");
        }else {
            String out = "";
            while (!liquidsDeque.isEmpty ()){
                out += liquidsDeque.poll () + ", ";
            }out = out.substring (0, out.length () - 2);
            System.out.println (out);
        }
        System.out.print ("Ingredients left: ");
        if(ingredientsStack.isEmpty ()){
            System.out.println ("none");
        }else {
            String out = "";
            while (!ingredientsStack.isEmpty ()){
                out += ingredientsStack.pop () + ", ";
            }out = out.substring (0, out.length () - 2);
            System.out.println (out);
        }
        System.out.println ("Bread: " + bread);
        System.out.println ("Cake: " + cake);
        System.out.println ("Fruit Pie: " + fruit_Pie);
        System.out.println ("Pastry: " + pastry);
    }

    public static boolean chek(int sum){
        return (sum == 25 || sum == 50 || sum == 75 || sum == 100);
    }public static boolean Wohoo(int bread, int cake, int pastry, int fruit_Pie){
        return (bread > 0 && cake > 0 && pastry > 0 && fruit_Pie > 0);
    }
}
