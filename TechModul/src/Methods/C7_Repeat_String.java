package ATECHMODUL.Methods;

import java.util.Scanner;

public class C7_Repeat_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        Repeat_String(p,a);

    }
    static String Repeat_String(String p,int a){
        String result = "";
        for (int i = 0; i < a; i++) {
            result += p;

        }System.out.println(result);
            return result;
        }


}
