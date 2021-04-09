package ATECHMODUL.List_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C4_List_Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        List<Integer> in = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            in.add(Integer.parseInt(p[i]));
        }
        while (true){
            String[] p1 = scanner.nextLine().split(" ");
            if(p1[0].equals("End")){break;}
            if(p1[0].equals("Insert")){
                int a = Integer.parseInt(p1[1]);
                int b = Integer.parseInt(p1[2]);
                if(b > in.size()){
                    System.out.println("Invalid index");
                }else {in.add(b,a);}
            }if(p1[0].equals("Add")){
                int a = Integer.parseInt(p1[1]);
                in.add(a);
            }if(p1[0].equals("Remove")){
                int a = Integer.parseInt(p1[1]);
                if(a > in.size()){
                    System.out.println("Invalid index");
                }else {in.remove(a);}
            }if(p1[1].equals("left")){
                int b = Integer.parseInt(p1[2]);
                for (int i = 0; i < b; i++) {
                    int a = in.get(0);
                    in.add(a);
                    in.remove(0);
                }
            }if(p1[1].equals("right")){
                int b = Integer.parseInt(p1[2]);
                for (int i = 0; i < b; i++) {
                    int a = in.get(in.size() - 1);
                    in.add(0,a);
                    in.remove(in.size() - 1);
                }
            }
        }for(Integer out : in){
            System.out.print(out + " ");
        }
    }
}
