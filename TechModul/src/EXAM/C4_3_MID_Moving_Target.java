package ATECHMODUL.EXAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C4_3_MID_Moving_Target {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int [] in1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(m->(Integer.parseInt(m))).toArray();
       List<Integer> in = new ArrayList<>();
       for(Integer out : in1){
           in.add(out);
       }while (true){
            String[] p = scanner.nextLine().split(" ");
            String command = p[0];
            if(command.equals("End")){break;}
            int index = Integer.parseInt(p[1]);
            int sum = Integer.parseInt(p[2]);
            if(command.equals("Shoot")){
                if(index < in.size() && index >= 0){
                    int oldsum = in.get(index);
                    oldsum -= sum;
                    if(oldsum <= 0){
                        in.remove(index);
                    }else {
                        in.remove(index);
                        in.add(index,oldsum);
                    }
                }
            }if(command.equals("Add")){
                if(index < in.size() && index >= 0){
                    in.add(index,sum);
                }else {
                    System.out.println("Invalid placement!");
                }
            }if(command.equals("Strike")){
                if(index < in.size() && index >= 0){
                if(index - sum >= 0 && index + sum < in.size()){
                    for (int i = 0; i < sum*2+1; i++) {
                        in.remove(in.get(index-sum));
                    }
                }else {
                    System.out.println("Strike missed!");
                   }
                }
            }
        }
        for (int i = 0; i < in.size() - 1; i++) {
            System.out.print(in.get(i) + "|");
        }
        System.out.println(in.get(in.size() - 1));
    }
}
