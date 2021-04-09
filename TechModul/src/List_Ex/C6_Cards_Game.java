package ATECHMODUL.List_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C6_Cards_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        String[] p1 = scanner.nextLine().split(" ");
        List<Integer> in = new ArrayList<>();
        List<Integer> in1 = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            in.add(Integer.parseInt(p[i]));
            in1.add(Integer.parseInt(p1[i]));
        }int sum = 0;
        while (in.size() > 0 || in1.size() > 0){
            if(in.get(0) > in1.get(0)){
                in.add(in.get(0));
                in.remove(0);
                in.add(in1.get(0));
                in1.remove(0);
                if(in1.size() == 0){break;}
            }else if(in1.get(0) > in.get(0)){
                in1.add(in1.get(0));
                in1.remove(0);
                in1.add(in.get(0));
                in.remove(0);
                if(in.size() == 0){break;}
            }else if(in.get(0).equals(in1.get(0))){
                in.remove(0);
                in1.remove(0);
            }
        }
        if(in.size() > 0){
            for (int i = 0; i < in.size(); i++) {
                sum+=in.get(i);
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }else {
            for (int i = 0; i < in1.size(); i++) {
                sum+=in1.get(i);
            }System.out.printf("Second player wins! Sum: %d",sum);
        }



    }
}
