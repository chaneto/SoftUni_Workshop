package ATECHMODUL.Methods;

import java.util.Scanner;

public class C9_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        if(p.equals("int")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int out = value_int(a,b);
            value_int(a,b);
            System.out.println(out);

        }if(p.equals("char")){
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            char out = value_chat(a,b);
            value_chat(a,b);
            System.out.println(out);
        }if(p.equals("string")){
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            String out = value_string(a,b);
            value_string(a,b);
            System.out.println(out);
        }

    }public static int value_int(int a, int b){
        int out = 0;
        if(a >= b){
            out = a;
        }
        if(b > a){
            out = b;
        }return out;
    }public static char value_chat (char a, char b){
        char out = 0;
        if(a >= b ){
            out = a;
        }else {
            out = b;
        }return out;
    }public static String value_string(String a, String b){
        String out = "";
        if(a.compareTo(b) >= 0){
            out = a;
        }else {
            out = b;
        }return out;
    }
}
