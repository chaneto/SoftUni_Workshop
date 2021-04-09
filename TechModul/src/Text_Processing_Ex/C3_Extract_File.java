package ATECHMODUL.Text_Processing_Ex;

import java.util.Scanner;

public class C3_Extract_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int index = p.lastIndexOf('\\');
        int point = p.lastIndexOf('.');
        String name = p.substring(index + 1,point);
        String file = p.substring(point + 1);
        System.out.printf("File name: %s%n",name);
        System.out.printf("File extension: %s",file);
    }
}
