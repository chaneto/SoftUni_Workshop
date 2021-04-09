package ATECHMODUL.Text_Processing;

import java.util.Scanner;

public class C5_Digits_Letters_and_Other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String digit = "";
        String chrk = "";
        String our = "";
        for (int i = 0; i < p.length(); i++) {
            char sumbol = p.charAt(i);
            if(Character.isLetter(sumbol)){
                chrk += sumbol;
            } else if(Character.isDigit(sumbol)){
                digit += sumbol;
            }else {
                our += sumbol;
            }
        }
        System.out.println(digit);
        System.out.println(chrk);
        System.out.println(our);
    }
}
