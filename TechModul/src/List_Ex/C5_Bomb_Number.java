package ATECHMODUL.List_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C5_Bomb_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        List<Integer> in = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            in.add(Integer.parseInt(p[i]));
        }
            String[] p1 = scanner.nextLine().split(" ");
            int a = Integer.parseInt(p1[0]);
            int b = Integer.parseInt(p1[1]);
            int sum = 0;


        for (int i = 0; i < in.size(); i++) {
            int c = b * 2;
            int counter = i - b;
            int max = in.size();
            if(i - b < 0){c += (i - b);counter = 0;}
            if(in.get(i).equals(a)){
                while (c >= 0){
                   if(counter == max){break;}
                   if(i - b < 0){
                       in.remove(0);
                   }else {in.remove(i - b);}
                   counter++;
                   c--;
                }
            }
        }
        for (int i = 0; i < in.size(); i++) {
            sum+=in.get(i);
        }
        System.out.println(sum);
    }
}
