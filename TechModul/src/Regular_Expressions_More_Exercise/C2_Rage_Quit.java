package Regular_Expressions_More_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C2_Rage_Quit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        p = p.toUpperCase();
        Pattern patternchar = Pattern.compile("\\D+");
        Matcher matcherchar = patternchar.matcher(p);
        Pattern patternnum = Pattern.compile("\\d+");
        Matcher matchernum = patternnum.matcher(p);
        String word = "";
        int replease  = 0;
        StringBuilder out = new StringBuilder();
        while (matchernum.find() && matcherchar.find()){
            word = matcherchar.group();
            replease = Integer.parseInt(matchernum.group());
            for (int i = 0; i < replease; i++) {
                out.append(word);
            }
        }


        System.out.printf("Unique symbols used: %d%n",out.chars().distinct().count());
        System.out.println(out);
    }
}
