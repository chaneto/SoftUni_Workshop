package ATECHMODUL.Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C2_Match_Phone_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\+359([\\- ])2(\\1)\\d{3}(\\1)[0-9]{4}\\b");
        Matcher matcher = pattern.matcher(p);
        List<String> matches = new ArrayList<>();
        while (matcher.find()){
            matches.add(matcher.group());

        }
        System.out.println(matches.toString().replaceAll("[\\[\\]]",""));


    }
}
