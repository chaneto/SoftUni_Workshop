package ATECHMODUL.Regular_Expressions_Ex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C6_Extract_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        Pattern pattern = Pattern.compile("(?<name>\\w+[\\.\\-\\_]*?\\w+)(?<et>@)(?<end>[A-Z|a-z]+([\\-\\.A-Z|a-z]+)*([A-Z|a-z]+))");
        for (int i = 0; i < p.length; i++) {
        Matcher mather = pattern.matcher(p[i]);
        if(mather.find()){
            System.out.println(mather.group());}
        }
    }
}
