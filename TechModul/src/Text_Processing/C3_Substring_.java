package ATECHMODUL.Text_Processing;

import java.util.Scanner;

public class C3_Substring_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String remove = scanner.nextLine();
        String text = scanner.nextLine();
        while (text.contains(remove)){
            int index = text.indexOf(remove);
            int lengt = remove.length();
            text = text.substring(0,index) + text.substring((index + lengt));
        }
        System.out.println(text);
    }
}
