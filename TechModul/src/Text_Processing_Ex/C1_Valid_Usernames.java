package ATECHMODUL.Text_Processing_Ex;

import java.util.Scanner;

public class C1_Valid_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(", ");
        for (int i = 0; i < p.length; i++) {
            String word = p[i];
            boolean out = true;
            if(word.length() >= 3 && word.length() <= 16){
                for (int j = 0; j < word.length(); j++) {
                    char chr = word.charAt(j);
                    if(!Character.isLetterOrDigit(chr) && chr != '-' && chr != '_' ){
                        out = false;
                    }
                }if(out){
                    System.out.println(word);
                }
            }
        }
    }
}
