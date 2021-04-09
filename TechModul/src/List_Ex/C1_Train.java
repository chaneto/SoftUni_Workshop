package ATECHMODUL.List_Ex;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        int a1 = Integer.parseInt(scanner.nextLine());
        List<Integer> in = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            in.add(Integer.parseInt(a[i]));
        }while (true){
            String[] p = scanner.nextLine().split(" ");
            if(p[0].equals("end")){break;}
            if(p[0].equals("Add")){
                int add = Integer.parseInt(p[1]);
                in.add(add);
            }else {
                int b = Integer.parseInt(p[0]);
                for (int i = 0; i < in.size(); i++) {
                    int b1 = in.get(i);
                    if((b + b1) <= a1 ){
                        in.set(i,(b + b1));break;
                    }
                }
            }

        }for(Integer out : in){
            System.out.print(out + " ");
        }
    }
}
