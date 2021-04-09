package ATECHMODUL.EXAM;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C5_2_Mirror_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<one>[@]{1}|[#]{1})(?<name>[A-Za-z]{3,})" +
                "(?<mitel>[@]{2}|[#]{2})(?<name2>[A-Za-z]{3,})(?<two>[@]{1}|[#]{1})");
        List<String> out = new ArrayList<>();
        int counter = 0;
        Matcher matcher = pattern.matcher(p);
        while (matcher.find()){
            String one = matcher.group("one");
            String two = matcher.group("two");
            String mitte = matcher.group("mitel");
            String mittel = "";
            mittel += mitte.charAt(0);
            if(one.equals(two) && two.equals(mittel)){
                counter++;
                String firstword = matcher.group("name");
                String secon = matcher.group("name2");
                String seconword = "";
                for (int i = secon.length() - 1; i >= 0 ; i--) {
                    seconword += secon.charAt(i);
                }
                if(firstword.equals(seconword)){
                    String result = "";
                    result += firstword;
                    result += " <=> ";
                    result += secon;
                    out.add(result);
                }
            }
        }if(counter > 0){
            System.out.printf("%s word pairs found!%n",counter);

        }else {
            System.out.println("No word pairs found!");
        }
        if(out.size() > 0){
            System.out.println("The mirror words are:");
            for (int i = 0; i < out.size() - 1; i++) {
                System.out.printf("%s, ",out.get(i));
            }
            System.out.println(out.get(out.size() - 1));
        }
        else {
            System.out.println("No mirror words!");
        }
    }
}
