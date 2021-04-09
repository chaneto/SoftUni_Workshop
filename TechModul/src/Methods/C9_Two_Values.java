package ATECHMODUL.Methods;

import java.util.Scanner;

public class C9_Two_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        if (p.equals("int")) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            ValuesInt(a, b);
        }
        if (p.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            ValuesChar(a, b);
        }
        if (p.equals("string")) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            ValueString(a, b);
        }
    }

    public static Integer ValuesInt(int a, int b) {
        int out = 0;
        if (a >= b) {
            out = a;
            System.out.println(out);
        }
        if (b > a) {
            out = b;
            System.out.println(out);
        }
        return out;
    }

    private static Character ValuesChar(char a, char b) {
        int out = 0;
        if (a >= b) {
            out = a;
            System.out.println((char) out);
        }
        if (b > a) {
            out = b;
            System.out.println((char) out);
        } else {
            System.out.println((char) a);
        }
        return (char) out;
    }

    public static String ValueString(String a, String b) {
        String out = "";
        if (a.compareTo(b) >= 0) {
            out = a;
            System.out.println(out);
        } else {
            out = b;
            System.out.println(out);
        }return out;
    }
}