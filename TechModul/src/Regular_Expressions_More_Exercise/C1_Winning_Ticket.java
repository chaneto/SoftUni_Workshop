package Regular_Expressions_More_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C1_Winning_Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(",\\s+");
        Pattern pattern = Pattern.compile("\\$+|\\@+|\\^+|\\#+");
        for (int i = 0; i < p.length; i++) {
            p[i] =  p[i].replaceAll(" ","");
            if(p[i].length() == 20){
                String left = p[i].substring(0,p[i].length()/2);
                String right = p[i].substring(p[i].length()/2);
                Matcher matcherleft = pattern.matcher(left);
                Matcher matcherright = pattern.matcher(right);
                left = "";
                right = "";
                while (matcherleft.find()){
                    if(matcherleft.group().length() > left.length()){
                        left = matcherleft.group();
                    }
                }while (matcherright.find()){
                    if(matcherright.group().length() > right.length()){
                        right = matcherright.group();
                    }
                }int pechalba = Math.min(right.length(),left.length());
                if((left.length() >= 6 && left.length() < 10) && (right.length() >= 6 && right.length() < 10)
                        && (left.charAt(0) == right.charAt(0))){
                    System.out.printf("ticket \"%s\" - %d%s%n",p[i],pechalba,left.charAt(0));
                }else if((left.length() == 10 && right.length() == 10) && (left.charAt(0) == right.charAt(0))){
                    System.out.printf("ticket \"%s\" - %d%s Jackpot!%n",p[i],left.length(),left.charAt(0));
                }else {
                    System.out.printf("ticket \"%s\" - no match%n",p[i]);
                }

            }else {
                System.out.println("invalid ticket");
            }

        }
    }
}
