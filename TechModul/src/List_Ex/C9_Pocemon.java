package ATECHMODUL.List_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class C9_Pocemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] p = scanner.nextLine().split(" ");
        List<Integer> in = new ArrayList<>();
        int out = 0;
        int num = 0;
        for(String i : p){
            in.add(Integer.parseInt(i));
        }while (in.size() > 0){
            int a = Integer.parseInt(scanner.nextLine());
            if(a < 0){
                in.remove(0);
                in.add(0,in.get(in.size()-1));
                num = in.get(0);
            }if(a > in.size() - 1){
                in.remove(in.size() - 1);
                in.add (in.get(0));
                num = in.get(in.size() - 1);
            }
            if(a >= 0 && a <= in.size() - 1){
                 num = in.get(a);
                in.remove(a);
            }
                out+=num;
                int sum = 0;
                for (int i = 0; i < in.size(); i++) {
                    int sec = in.get(i);
                    if(num < sec){
                        sum = sec - num;
                        in.set(i,sum);
                    }else {
                        sum = num + sec;
                        in.set(i,sum);
                    }
                }
        }
        System.out.println(out);

    }
}
