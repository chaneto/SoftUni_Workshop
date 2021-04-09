package ATECHMODUL.Regular_Expressions_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class C4_Star_Enigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<String> in = new ArrayList<>();
        List<String> A = new ArrayList<>();
        List<String> D = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String p = scanner.nextLine();
          int count  = 0 ;
            for (int j = 0; j < p.length(); j++) {
                if(p.charAt(j) == 's' || p.charAt(j) == 't' || p.charAt(j) == 'a' || p.charAt(j) == 'r'
                || p.charAt(j) == 'S' || p.charAt(j) == 'T' || p.charAt(j) == 'A' || p.charAt(j) == 'R'){
                    count++;
                }
            }String word = "";
            for (int j = 0; j < p.length() ; j++) {
                char vr = (char) (p.charAt(j) - count);
                word +=  vr ;
            }in.add(word);
        }
        Pattern pattern = Pattern.compile("\\@(?<name>[A-Z|a-z]*)[^@\\-!:\\^]*\\:(?<people>[0-9]+)" +
                "[^@\\-!:\\^]*\\!(?<atack>[AD])\\![^@\\-!:\\^]*->(?<broi>[0-9]+)");
        for (int i = 0; i < in.size(); i++) {
            Matcher matches = pattern.matcher(in.get(i));
            if(matches.find()){
                String chr = matches.group("atack");
                String planet = matches.group("name");
                if(chr.equals("A")){
                    A.add(planet);
                }else {
                    D.add(planet);
                }
            }
        }
        System.out.printf("Attacked planets: %d%n",A.size());
        A.stream().sorted((s1,s2) -> s1.compareTo(s2)).forEach(f -> System.out.printf("-> %s%n",f));
        System.out.printf("Destroyed planets: %d%n",D.size());
        D.stream().sorted((s1,s2) -> s1.compareTo(s2)).forEach(f -> System.out.printf("-> %s%n",f));

    }
}
