package ATECHMODUL.Text_Processing;

import java.util.Scanner;

public class C3_Substring_Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String remove = scanner.nextLine();
        String text = scanner.nextLine();
        while (text.contains(remove)){
            text = text.replace(remove,"");
        } System.out.println(text);
    }
}
