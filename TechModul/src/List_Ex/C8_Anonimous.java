package ATECHMODUL.List_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class C8_Anonimous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> in = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> vr = new ArrayList<>();
       String wort = "";
       String wort1 = "";

        while (true){
            String [] cmd = scanner.nextLine().split(" ");
            if(cmd [0].equals("3:1")){break;}
            int a = Integer.parseInt(cmd[1]);
           double b = Double.parseDouble(cmd[2]);
            if(cmd[0].equals("merge")){
                if(b >= in.size()){b = in.size() - 1;}
                if(a >= in.size()){continue;}
                for (int i = a; i <= b; i++) {
                    wort+=in.get(i);
                }
                for (int i = a; i <= b; i++) {
                    in.remove(a);
                }
                in.add(a,wort);
                wort = "";
            }if(cmd[0].equals("divide")){
                if(a > in.size()){continue;}
                int counter = 0;
                wort = in.get(a);
                in.remove(a);
                double length = wort.length();
                double del = length / b;
                double del1 = Math.floor(del);
                if(del %2 == 0) {
                    for (int i = 0; i < wort.length(); i++) {
                        wort1+=wort.charAt(i);
                        counter++;
                        if(counter == del1){
                            wort1+=" ";
                            counter = 0;
                    }
                    }in.add(a,wort1);
                    wort1 = "";
                    wort = "";
                }else {
                    int stop = 0;
                    for (int i = 0; i < wort.length(); i++) {//abcd
                        wort1+=wort.charAt(i);
                        counter++;
                        if(counter == del1){
                            stop++;
                            if(stop >= b){continue;}
                            wort1+=" ";
                            counter= 0;
                        }
                    }in.add(a,wort1);
                    wort = "";
                    wort1 = "";
                    stop = 0;
                }

            }
        }
        System.out.println(String.join(" ",in));
    }
}
