package ATECHMODUL.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C2_Gaus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        List <Integer> in = new ArrayList<>();
        List<Integer> aut = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            in.add(Integer.parseInt(p[i]));
        }if(in.size() %2 == 0){
            for (int i = 0; i < in.size(); i++) {
                int num = in.get(0) + in.get(in.size() - 1);
                in.remove(0);
                in.remove(in.size() - 1);
                aut.add(num);
            }
        }else {
            for (int i = 0; i < in.size(); i++) {
                int num = in.get(0) + in.get(in.size() - 1);
                in.remove(0);
                in.remove(in.size() - 1);
                aut.add(num);
            }aut.add(in.get(0));
        }
        for(Integer out : aut){
            System.out.print(out + " ");
        }
    }
}
