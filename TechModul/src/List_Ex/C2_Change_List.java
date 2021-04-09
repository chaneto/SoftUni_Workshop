package ATECHMODUL.List_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C2_Change_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        List<Integer> in = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            in.add(Integer.parseInt(p[i]));
        }while (true){
            String[] p1 = scanner.nextLine().split(" ");
            if(p1[0].equals("end")){break;}
            if(p1[0].equals("Delete")){
                int a = Integer.parseInt(p1[1]);
                for (int i = 0; i < in.size(); i++) {
                    in.remove(Integer.valueOf(a));
                }
            }if(p1[0].equals("Insert") ){
                int a = Integer.parseInt(p1[2]);
                int a1 = Integer.parseInt(p1[1]);
                if (a < in.size()) {
                    in.add(a,a1);
                }

            }
        }
        for (int i = 0; i < in.size(); i++) {
            System.out.print(in.get(i) + " ");
        }
    }
}
