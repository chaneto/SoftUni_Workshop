package ATECHMODUL.Methods;

import java.util.Scanner;

public class C2_Grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        String [] out = new String[]{"Fail","Poor","Good","Very good","Excellent"};

        m(a,out);

    }public static Double m(double b,String[] out){
        if(b >= 2 && b < 3){
            System.out.println(out[0]);
        }if(b >= 3 && b < 3.5){
            System.out.println(out[1]);
        }if(b >= 3.5 && b < 4.5){
            System.out.println(out[2]);
        }if(b >= 4.5 && b < 5.5){
            System.out.println(out[3]);
        }if(b >= 5.5 && b < 6){
            System.out.println(out[4]);
        }return b;

    }
}