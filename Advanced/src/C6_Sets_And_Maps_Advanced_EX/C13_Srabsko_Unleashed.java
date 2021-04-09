package C6_Sets_And_Maps_Advanced_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C13_Srabsko_Unleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,Long>> in = new LinkedHashMap<>();
        while (true){
            String p = scanner.nextLine();
            if(p.equals("End")){break;}
            Pattern pattern = Pattern.compile("(?<name>(.*?))\\s@(?<town>(.*?))\\s(?<price>(\\d+))\\s(?<sum>(\\d+))");
            Matcher matcher = pattern.matcher(p);
        if(matcher.find()){
            String name = matcher.group("name");
            String town = matcher.group("town");
            Long price = Long.parseLong(matcher.group("price"));
            Long sum = Long.parseLong(matcher.group("sum"));
            Long sbor = price * sum;
            if(!in.containsKey(town)){
                in.put(town,new LinkedHashMap<>());
                in.get(town).put(name,sbor);
            }else {
                if(!in.get(town).containsKey(name)){
                    in.get(town).put(name,sbor);
                }else {
                    in.get(town).put(name,in.get(town).get(name) + sbor);
                }
            }
           }
        }in.entrySet().stream()
                .forEach(f -> {
                    System.out.println(f.getKey());
                    f.getValue().entrySet().stream()
                            .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                            .forEach(m -> System.out.printf("#  %s -> %d%n",m.getKey(),m.getValue()));
                });
    }
}
