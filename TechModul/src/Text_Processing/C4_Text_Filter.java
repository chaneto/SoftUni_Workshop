package ATECHMODUL.Text_Processing;

import java.util.Scanner;

public class C4_Text_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = scanner.nextLine().split(", ");
        String in = scanner.nextLine();
        for (int i = 0; i < word.length; i++) {
            String vr = word[i];
            String a = "";
            for (int j = 0; j < vr.length(); j++) {
                a+="*";
            }in = in.replace(vr,a);
        }
        System.out.println(in);
    }
}
