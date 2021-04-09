package ATECHMODUL.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C3_Merging_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        String[] p1 = scanner.nextLine().split(" ");
        List<Integer> in = new ArrayList<>();
        List<Integer> in1 = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            in.add(Integer.parseInt(p[i]));
        } for (int i = 0; i < p1.length; i++) {
            in1.add(Integer.parseInt(p1[i]));
        }if(in.size() > in1.size()){
            for (int i = 0; i < in1.size(); i++) {
                out.add(in.get(i));
                out.add(in1.get(i));
            }
            for (int i = in1.size(); i < in.size(); i++) {
                out.add(in.get(i));
            }
        }if(in1.size() > in.size()){
            for (int i = 0; i < in.size(); i++) {
                out.add(in.get(i));
                out.add(in1.get(i));
            }
            for (int i = in.size(); i < in1.size(); i++) {
                out.add(in1.get(i));
            }
        }if(in1.size() == in.size()){
            for (int i = 0; i < in.size(); i++) {
                out.add(in.get(i));
                out.add(in1.get(i));
            }
        }
        for(Integer out1 : out){
            System.out.print(out1 + " ");
        }
    }
}
