package C6_Sets_And_Maps_Advanced_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C7_Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> map = new LinkedHashMap<>();
        int couter = 0;
        Pattern pattern = Pattern.compile("[.](?<end>[a-z]+)");
        while (true){
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            if(matcher.find()){
                String com = matcher.group("end");
                if(!com.equals("com") && !com.equals("us") && !com.equals("uk")){
                    map.put(input,email);
                }
            }
        }map.entrySet().stream()
                .forEach(f -> System.out.printf("%s -> %s%n",f.getKey(),f.getValue()));
    }
}
