package ATECHMODUL.EXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C2_2Boss_Rush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("\\|(?<name>[A-Z]{4,})\\|:#(?<text>[A-Za-z]+ [A-Za-z]+)#");
        for (int i = 0; i < a; i++) {
            String in = scanner.nextLine();
            Matcher matcher = pattern.matcher(in);
            if(matcher.find()){
                String name = matcher.group("name");
                String text = matcher.group("text");
                System.out.printf("%s, The %s%n>> Strength: %d%n>> Armour: %d%n",name,text,name.length(),text.length());
            }else {
                System.out.println("Access denied!");
            }
        }
    }
}
