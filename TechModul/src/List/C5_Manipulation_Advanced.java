package ATECHMODUL.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C5_Manipulation_Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] p = scanner.nextLine().split(" ");
        List<Integer> in = new ArrayList<>();
        int sum = 0;
        String m = "";
        int counter = 0;
        for (int i = 0; i < p.length; i++) {
            in.add(Integer.parseInt(p[i]));
        }while (true){
            String[] p1 = scanner.nextLine().split(" ");
            if(p1[0].equals("end")){break;}
            if(p1[0].equals("Contains")){
                counter = 0;
                for (int i = 0; i < in.size(); i++) {
                    int a = Integer.parseInt(p1[1]);
                    if(in.get(i).equals(a)){
                        m = "yes";
                        System.out.println("Yes");

                    }if(in.get(i) != a){
                        counter++;
                    }if(counter == in.size()){
                        System.out.println("No such number");}
                }
            }if(p1[1].equals("even")){
                for (int i = 0; i < in.size(); i++) {
                    if(in.get(i) %2 == 0){
                        System.out.print(in.get(i) + " ");
                    }
                }
                System.out.println();
            }if(p1[1].equals("odd")){
                for (int i = 0; i < in.size(); i++) {
                    if(in.get(i) %2 != 0){
                        System.out.print(in.get(i) + " ");
                    }
                }
                System.out.println();
            }if(p1[1].equals("sum")){
                for (int i = 0; i < in.size(); i++) {
                    sum += in.get(i);
                }
                System.out.println(sum);
            }if(p1[1].equals("<")){
                int a = Integer.parseInt(p1[2]);
                for (int i = 0; i < in.size(); i++) {
                    int b = in.get(i);
                    if(b < a){
                        System.out.print(in.get(i) + " ");
                    }
                }
                System.out.println();
            }if(p1[1].equals("<=")){
                int a = Integer.parseInt(p1[2]);
                for (int i = 0; i < in.size(); i++) {
                    if(in.get(i) <= a){
                        System.out.print(in.get(i) + " ");
                    }
                }
                System.out.println();
            }if(p1[1].equals(">")){
                int a = Integer.parseInt(p1[2]);
                for (int i = 0; i < in.size(); i++) {
                    if(in.get(i) > a){
                        System.out.print(in.get(i) + " ");
                    }
                }
                System.out.println();
            }if(p1[1].equals(">=")){
                int a = Integer.parseInt(p1[2]);
                for (int i = 0; i < in.size(); i++) {
                    if(in.get(i) >= a){
                        System.out.print(in.get(i) + " ");
                    }
                }
                System.out.println();
            }
        }

    }
}
