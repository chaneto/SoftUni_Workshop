package ATECHMODUL.Methods;

import java.util.Scanner;

public class C4_Calculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int a1 = Integer.parseInt(scanner.nextLine());

        m(p,a,a1 );

    }public static Integer m(String p, int a,int a1){
        if(p.equals("add")){
            a = a + a1;
        }if(p.equals("subtract")){
            a = a - a1;
        }if(p.equals("divide")){
            if(a == 0 || a1 == 0){
                a = 0;
            }else {
                a = a / a1;
            }
        }if(p.equals("multiply")){
            a = a * a1;
        }
        System.out.println(a);
        return a;
    }

}
