package ATECHMODUL.Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C1_Match_Full_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+");
        Matcher matcher = pattern.matcher(p);
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
