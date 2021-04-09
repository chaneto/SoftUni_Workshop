package ATECHMODUL.List_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C3_House_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int counter1 = 0;
        List<String> out = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");

            if(out.size() == 0 && p[2].equals("going!")){
                out.add(p[0]);}
            else {
            if(p[2].equals("going!")){
                for (int j = 0; j < out.size(); j++) {
                    if(p[0].equals(out.get(j))){
                     counter++;
                    }
                }if(counter > 0){
                    System.out.printf("%s is already in the list!%n",p[0]);
                }else {
                    out.add(p[0]);
                }counter = 0;
            }if(p[2].equals("not")){
                for (int j = 0; j < out.size(); j++) {
                    if(p[0].equals(out.get(j))){
                        counter1++;
                    }
                }if(counter1 > 0){
                    out.remove((String) p[0]);
                    }else {
                        System.out.printf("%s is not in the list!%n",p[0]);
                    }
              }counter1 = 0;
            }
        }for(String out1 : out ){
            System.out.println(out1);
        }
    }
}
