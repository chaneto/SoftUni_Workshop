package ATECHMODUL.Text_Processing_Ex;

import java.util.Scanner;

public class C1_Andere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(", ");
        for (int i = 0; i < p.length; i++) {
            String word = p[i];
            if(isvalid(word)){
                System.out.println(word);
            }
        }
    }public static boolean isvalid(String  word){
        if(word.length() < 3 || word.length() > 16){
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if(!Character.isLetterOrDigit(letter) && letter != '_' && letter != '-'){
                return false;
            }
        }return true;
    }
}
