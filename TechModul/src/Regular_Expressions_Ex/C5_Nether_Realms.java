package ATECHMODUL.Regular_Expressions_Ex;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C5_Nether_Realms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(",\\s+");
        Pattern win = Pattern.compile("[^\\.\\*\\+\\-\\/\\d]");//Sd22%k^(k#m
        Pattern down = Pattern.compile("(-?\\d+\\.?\\d*)");
        Map<String,Integer> out = new TreeMap<>();
        Map<String,Double> out1 = new TreeMap<>();
        for (int i = 0; i < p.length; i++) {
            String word = p[i].replaceAll(" ","");
            Matcher matherwin = win.matcher(word);
            Matcher matherdown = down.matcher(word);
            int health = 0;
            double los = 0;
            int umn = 0;
            int del = 0;
            for (int j = 0; j < word.length(); j++) {

              if(matherwin.find()) {
                  health += matherwin.group().charAt(0);
              }if(matherdown.find()){
                  los = los + (Double.parseDouble(matherdown.group()));
                }
            }
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j) == '*'){
                    los *= 2;
                }if(word.charAt(j) == '/'){
                    los /= 2;
                }
            }if(!out.containsKey(word)){
                out.put(word,health);
                out1.put(word,los);
            }

        }for(Map.Entry<String,Integer> t : out.entrySet()){
            System.out.printf("%s - %d health, %.2f damage%n",t.getKey(),t.getValue(),out1.get(t.getKey()));
        }
    }
}
