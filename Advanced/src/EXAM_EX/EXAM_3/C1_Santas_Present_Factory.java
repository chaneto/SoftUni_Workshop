package EXAM_EX.EXAM_3;

import java.util.*;

public class C1_Santas_Present_Factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Deque<Integer> stackmaterial = new ArrayDeque<> ();
        Deque<Integer> dequemagic = new ArrayDeque<> ();
        Map<String,Integer> map = new TreeMap<> ();
        for (int i = 0; i < 2; i++) {
            int[] input = Arrays.stream (scanner.nextLine ().split ("\\s+")).mapToInt (Integer::parseInt).toArray ();
            for (int j = 0; j < input.length; j++) {
                if(i == 0){
                    stackmaterial.push (input[j]);
                }else {
                    dequemagic.offer (input[j]);
                }
            }
        }
        int doll = 0;
        int Wooden_train = 0;
        int Teddy_bear = 0;
        int Bicycle = 0;
        while (!(stackmaterial.isEmpty () || dequemagic.isEmpty ())){
            if (stackmaterial.peek() == 0 || dequemagic.peek() == 0)
            {
                if (stackmaterial.peek() == 0)
                {
                    stackmaterial.pop();
                }
                if (dequemagic.peek() == 0)
                {
                    dequemagic.poll();
                }
                continue;
            }
            int material = stackmaterial.pop ();
            int magic = dequemagic.poll ();
            int result = material * magic;

            if(result == 150 || result == 250 || result == 300 || result == 400){

            if(result == 150){
                doll++;
            }
            if(result == 250){
                Wooden_train++;
            }
            if(result == 300){
                Teddy_bear++;
            }
            if(result == 400) {
                Bicycle++;
            }

            }else {
                if(result < 0){
                    result = material + magic;
                    stackmaterial.push (result);
                }else if(result > 0){
                    result = material + 15;
                    stackmaterial.push (result);
                }
            }
        }map.put ("Doll",doll);
        map.put ("Teddy bear",Teddy_bear);
        map.put ("Bicycle",Bicycle);
        map.put ("Wooden train",Wooden_train);
        if((Teddy_bear > 0 && Bicycle > 0 )|| (doll > 0 && Wooden_train > 0)){
            System.out.println ("The presents are crafted! Merry Christmas!");
            print (map, stackmaterial, dequemagic);
        }else {
            System.out.println ("No presents this Christmas!");
            print (map, stackmaterial, dequemagic);
        }
    }public static void print(Map<String,Integer> map, Deque<Integer> stack, Deque<Integer> deque ){
        if(stack.size () > 0){
            System.out.print ("Materials left: ");
            while (!stack.isEmpty ()){
                if(stack.size () > 1){
                    System.out.print (stack.pop () + ", ");
                }else {
                    System.out.println (stack.pop ());
                }
            }
        }if(deque.size () > 0){
            System.out.print ("Magic left: ");
            while (!deque.isEmpty ()){
                if(deque.size () > 1){
                    System.out.print (deque.poll () + ", ");
                }else {
                    System.out.println (deque.poll ());
                }
            }
        }map.entrySet ().stream ()
                .filter (f -> f.getValue () > 0)
                .forEach (f -> System.out.printf ("%s: %d%n",f.getKey (),f.getValue ()));
    }
}
