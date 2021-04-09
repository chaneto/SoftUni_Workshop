package ATECHMODUL.Regular_Expressions_More_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C4_Santas_Secret_Helper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<String> out = new ArrayList<>();
        while (true){
            String p = scanner.nextLine();
            if(p.equals("end")){break;}
            String neu = "";
            for (int i = 0; i < p.length(); i++) {
                char vr = (char) (p.charAt(i) - a);
                neu += vr;
            }
            Pattern pattern = Pattern.compile("@(?<ime>[A-Z][a-z]+)([^\\-@!:]+)?!(?<bukva>[A-Z])!");
            Matcher matcher = pattern.matcher(neu);
            if(matcher.find()){
                String name = matcher.group("ime");
                String chr = matcher.group("bukva");
                if(chr.equals("G")){
                    out.add(name);
                }
            }
        }for(String out1 : out){
            System.out.println(out1);
        }

    }
}
