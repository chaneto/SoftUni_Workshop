package ATECHMODUL.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C7_Remove_Reverce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] p = scanner.nextLine().split(" ");
        List<Integer> in = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            in.add(Integer.parseInt(p[i]));
        }
        for (int i = 0; i < in.size(); i++) {
            int a = in.get(i);
            if(a < 0){
                in.remove(i);
                i--;
            }
        }
        Collections.reverse(in);
        if(in.size() == 0){
            System.out.println("empty");
        }else {


        for(Integer out : in){
            System.out.print(out + " ");
        }
        }
    }
}
