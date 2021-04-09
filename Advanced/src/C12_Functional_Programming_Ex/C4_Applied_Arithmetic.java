package C12_Functional_Programming_Ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class C4_Applied_Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        Function<int[],int[]> add = f -> Arrays.stream (f).map (s -> s + 1).toArray ();
        Function<int[],int[]> substract = f -> Arrays.stream (f).map (s -> s - 1).toArray ();
        Function<int[],int[]> multiply = f -> Arrays.stream (f).map (s -> s * 2).toArray ();
        Consumer<int[]> print  = f -> Arrays.stream (f).forEach (s -> System.out.print (s + " "));
        Function<Integer,Integer> function;
        while (true){
            String comand = scanner.nextLine ();
            if(comand.equals ("end")){
                break;
            }if(comand.equals ("add")){
               input = add.apply (input);
            }else if(comand.equals ("subtract")){
               input = substract.apply (input);
            }else if(comand.equals ("multiply")){
               input = multiply.apply (input);
            }else if(comand.equals ("print")){
              print.accept (input);
                System.out.println ();
            }

        }
    }
}
