package ATECHMODUL.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C4_List_Manipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        List<Integer> in = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            in.add(Integer.parseInt(p[i]));
        }
        while (true){
            String[] p1 = scanner.nextLine().split(" ");
            if(p1[0].equals("end")){break;}
            if(p1[0].equals("Add")){
                Integer a = Integer.parseInt(p1[1]);
                in.add(in.size(),a);
            }if(p1[0].equals("Remove")){
                Integer a = Integer.parseInt(p1[1]);
                in.remove(a);
            }if(p1[0].equals("RemoveAt")){
                in.remove(Integer.parseInt(p1[1]));
            }if(p1[0].equals("Insert")){
                Integer a = Integer.parseInt(p1[1]);
                Integer b = Integer.parseInt(p1[2]);
                in.add(b,a);
            }
        }for(Integer out : in){
            System.out.print(out + " ");
        }
    }
}
