package Regular_Expressions_Ex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C2_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split(", ");
        Map<String,Integer> out = new LinkedHashMap<>();
        boolean yes = false;
        Pattern patternname = Pattern.compile("[A-Z]|[a-z]");
        Pattern patternkm = Pattern.compile("[0-9]");
        while (true){
            String text = scanner.nextLine();
            if(text.equals("end of race")){break;}
            Matcher matchername = patternname.matcher(text);
            Matcher matcherkm = patternkm.matcher(text);
            String name = "";
            int km = 0;
            for (int i = 0; i < text.length(); i++) {
                if(matchername.find()){
                    name+=matchername.group();
                }if(matcherkm.find()){
                    km += Integer.parseInt(matcherkm.group());
                }
            }
            for (int i = 0; i < in.length; i++) {
                if(name.equals(in[i])){
                    yes = true;
                }
            }if(yes){
                if(!out.containsKey(name)){
                    out.put(name,km);
                }else {
                    int vr = km + out.get(name);
                    out.put(name,vr);
                }
            }yes = false;

        }Integer [] num = {1};
        out.entrySet()
                .stream()
                .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                .limit(3)
                .forEach(f -> {
                    String nd ="";
                    if(num[0] == 1){
                        nd = "st";
                    }if(num[0] == 2){
                        nd = "nd";
                    }if(num[0] == 3){
                        nd = "rd";
                    }
                    System.out.printf("%d%s place: %s%n",num[0]++,nd,f.getKey());
                });
    }
}
