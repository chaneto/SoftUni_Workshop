package EXAM_EX.EXAM_1;

import java.util.*;
import java.util.stream.Collectors;

public class C2_Make_Salad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Deque<String> productDeque = new ArrayDeque<> ();
        Deque<Integer> calorieStack = new ArrayDeque<> ();
        Deque<Integer> outputDeque = new ArrayDeque<> ();
        for (int i = 0; i < 2; i++) {
            String[] input = scanner.nextLine ().split (" ");
            for (int j = 0; j < input.length; j++) {
                if(i == 0){
                    productDeque.offer (input[j]);
                }else {
                    calorieStack.push (Integer.parseInt (input[j]));
                }
            }
        }while (!(productDeque.isEmpty () || calorieStack.isEmpty ())){
            int calorieOut = calorieStack.peek ();
            int calorie = calorieStack.pop ();
            while (calorie > 0){
                String product = productDeque.poll ();
                if(productDeque.isEmpty ()){
                    break;
                }
                if(product.equals ("tomato")){
                    calorie -= 80;
                }else if(product.equals ("carrot")){
                    calorie -= 136;
                }else if(product.equals ("lettuce")){
                    calorie -= 109;
                }else if(product.equals ("potato")){
                    calorie -= 215;
                }

            }
            outputDeque.offer (calorieOut);

        }while (!outputDeque.isEmpty ()){
            System.out.print (outputDeque.poll () + " ");
        }
        System.out.println ();
        while (!productDeque.isEmpty ()){
            System.out.print (productDeque.poll () + " ");
        }while (!calorieStack.isEmpty ()){
            System.out.print (calorieStack.pop () + " ");
        }
        }
    }

