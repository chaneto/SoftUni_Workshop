package ATECHMODUL.Methods;

import java.util.Scanner;

public class C4_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int a1 = Integer.parseInt(scanner.nextLine());
        m(p,a,a1);
    }public static Integer m (String p,int a, int a1){
        switch (p){
            case "add":
                a = a +a1;
                break;
            case "divide":
                if(a == 0 || a1 == 0){
                    a = 0;
                }else {a = a / a1;
                }break;
            case "multiply":
                a = a * a1;
                break;
            case "subtract":
                a = a - a1;
                break;


        }
        System.out.println(a);
        return a;
    }
}
