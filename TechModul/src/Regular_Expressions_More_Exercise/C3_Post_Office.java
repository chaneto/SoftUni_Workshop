package ATECHMODUL.Regular_Expressions_More_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3_Post_Office {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split("\\|");
        Pattern one = Pattern.compile("([#$%*&])([A-Z]+)\\1");
        Matcher one1 = one.matcher(p[0]);
        Pattern two = Pattern.compile("\\d{2}:\\d{2}");
        Matcher two2 = two.matcher(p[1]);
        Pattern tree = Pattern.compile("\\S+");
        Matcher tree3 = tree.matcher(p[2]);
        List<String> duma = new ArrayList<>();
        List<Integer> bukva = new ArrayList<>();
        List<Integer> duljina = new ArrayList<>();
        String cmd = "";
        if(one1.find()){
            if(one1.group().charAt(0) == one1.group().charAt(one1.group().length() - 1)){
                cmd = one1.group().substring(1,one1.group().length() - 1);
            }
        }while (tree3.find()){
            String word = tree3.group();
            duma.add(word);
        }
        int count = 0;
        while (two2.find()){
            String[] time = two2.group().split(":");
            int C = Integer.parseInt(time[0]);
            int lenght = Integer.parseInt(time[1]);
            bukva.add(C);
            duljina.add(lenght);
        }while (count < cmd.length()){
            for (int i = 0; i < bukva.size(); i++) {
                if(cmd.charAt(count) == bukva.get(i)){
                    int glavno = bukva.get(i);
                    int dlg = duljina.get(i);
                    for (int j = 0; j < duma.size(); j++) {
                        if(duma.get(j).charAt(0) == glavno && duma.get(j).length() == dlg + 1){
                            System.out.println(duma.get(j));
                            count++;
                            break;
                        }
                    }
                }
            }

        }
    }
}
