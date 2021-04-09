package ATECHMODUL.EXAM;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3_2_Emoji_Detector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        List<String> out = new ArrayList<>();
        Pattern digit = Pattern.compile("[0-9]");
        Matcher matcherdigit = digit.matcher(p);
        BigDecimal sum = new BigDecimal("1");
        int count = 0;
        while (matcherdigit.find()){
          BigDecimal num = new BigDecimal(matcherdigit.group());
          sum = sum.multiply(num);
        }Pattern name = Pattern.compile("(?<one>[:]{2}|[*]{2})(?<name>[A-Z][a-z]{2,})(?<two>[:]{2}|[*]{2})");
        Matcher matchername = name.matcher(p);
        while (matchername.find()){
            String one = matchername.group("one");
            String two = matchername.group("two");
            if(one.equals(two)){
            BigDecimal namesim = new BigDecimal("0");
            count++;
            String ime = matchername.group("name");
            String fullime = matchername.group();
            for (int i = 0; i < ime.length(); i++) {
                BigDecimal num = new BigDecimal(ime.charAt(i));
                namesim = namesim.add(num);
            }if(namesim.compareTo(sum) >= 0){
                out.add(fullime);

              }
            }
        }
        System.out.printf("Cool threshold: %.0f%n",sum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",count);
        if(out.size() > 0){
        for (int i = 0; i < out.size(); i++) {
            System.out.println(out.get(i));
        }
        }

    }
}
