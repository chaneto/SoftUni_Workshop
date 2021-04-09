package ATECHMODUL.EXAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mirror_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String word1 = "";
        String word2 = "";
        boolean yes = false;
        boolean yes1 = false;
        boolean pechat = false;
        List<String> out = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < p.length() - 1; i++) {
            if(p.charAt(i) == '#' && p.charAt(i + 1) == '#'){
                int index = 0;
                yes = false;
                yes1 = false;
                for (int j = i - 1; j >= 0 ; j--) {
                    if(!Character.isLetter(p.charAt(j))){
                        index = j;
                        break;
                    }
                }if(p.charAt(index) == p.charAt(i) && i - index  > 3){//@rec@@cer@@set@@tes@
                    word1 = p.substring(index + 1,i);
                    if(p.charAt(index) == '#'){
                        yes = true;
                    }
                    index = 0;
                }
                for (int j = i + 2; j < p.length(); j++) {
                    if(!Character.isLetter(p.charAt(j))){
                        index = j;
                        break;
                    }
                }if(p.charAt(index) == p.charAt(i) && index - i  > 3){
                    word2 = p.substring(i + 2 ,index);
                    if(p.charAt(index) == '#'){
                        yes1 = true;
                    }
                    index = 0;
                }if(yes && yes1){
                    a++;
                }else {
                    word1 = "";
                    word2 = "";
                }
                if(word1.length() > 0 && word2.length() > 0){

                    StringBuilder reverset = new StringBuilder();
                    reverset.append(word2);
                    reverset.reverse();
                    String vr = "";
                    vr += reverset;
                    if(word1.equals(vr)){
                        out.add(word1 + " <=> " + word2);
                        i = i + word1.length() + 2;
                    }
                }

            }   if(p.charAt(i) == '@' && p.charAt(i + 1) == '@'){
                int index = 0;
                yes = false;
                yes1 = false;
                for (int j = i - 1; j >= 0 ; j--) {
                    if(!Character.isLetter(p.charAt(j))){
                        index = j;
                        break;
                    }
                }if(p.charAt(index) == p.charAt(i) && i - index  > 3){//aa#rok#kor#rr#por##rop#tt
                    word1 = p.substring(index + 1,i);
                    if(p.charAt(index) == '@'){
                        yes = true;
                    }
                    index = 0;
                }
                for (int j = i + 2; j < p.length(); j++) {
                    if(!Character.isLetter(p.charAt(j))){
                        index = j;
                        break;
                    }
                }if(p.charAt(index) == p.charAt(i) && index - i  > 3){
                    word2 = p.substring(i + 2 ,index);
                    if(p.charAt(index) == '@'){
                        yes1 = true;
                    }
                    index = 0;
                }if(yes && yes1){
                    a++;
                }else {
                    word1 = "";
                    word2 = "";
                }
                if(word1.length() > 0 && word2.length() > 0){
                    StringBuilder reverset = new StringBuilder();
                    reverset.append(word2);
                    reverset.reverse();
                    String vr = "";
                    vr += reverset;
                    if(word1.equals(vr)){
                        out.add(word1 + " <=> " + word2);
                        i = i + word1.length() + 2;
                    }
                }

            }

        }if(a > 0){
            System.out.printf("%d word pairs found!%n",a);
        }else {
            System.out.println("No word pairs found!");
        }if(out.size() > 0){
            System.out.println("The mirror words are:");
            for (int i = 0; i < out.size() - 1; i++) {
                System.out.printf("%s, ",out.get(i));
            }
            System.out.println(out.get(out.size() - 1));

        }else {
            System.out.println("No mirror words!");
        }
    }
}
