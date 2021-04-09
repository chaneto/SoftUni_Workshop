package ATECHMODUL.EXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C1_2Message_Translator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++) {
            String p = scanner.nextLine();
            Pattern pattern = Pattern.compile("!(?<name>[A-Z][a-z]+)!:\\[(?<text>[A-Z+a-z]+)\\]");
            Matcher matcher = pattern.matcher(p);
            if(matcher.find()){
                String name = matcher.group("name");
                String text = matcher.group("text");
                if(name.length() >2 && text.length() > 7 ){
                    System.out.print(name + ": ");
                    for (int j = 0; j < text.length() - 1; j++) {
                        System.out.print((int)text.charAt(j) + " ");
                    }System.out.println((int) text.charAt(text.length() - 1));
                }else {
                    System.out.println("The message is invalid");
                }
            }else {
                System.out.println("The message is invalid");
            }
        }
    }
}
