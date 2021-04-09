package ATECHMODUL.Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3_Match_Dates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        Pattern patern = Pattern.compile("\\b(?<day>\\d\\d)([\\.\\-\\/])(?<month>[A-Z][a-z]{2})(\\2)(?<year>\\d{4})\\b");
        Matcher matcher = patern.matcher(p);
        while (matcher.find()){
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
        }

    }
}
