package ATECHMODUL.Method_more_Ex;

import java.util.Scanner;

public class C1_Data_Type {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String d = scanner.nextLine();
        String win = "";
        double a = 0;
        if(p.equals("int")){
           win+= into(p,d);
            System.out.println(win);
        }if(p.equals("real")){
            a = db(p,d);
            System.out.printf("%.2f",a);
        }if(p.equals("string")){
            win+= st(p,d);
            System.out.println(win);
        }

    }public static int into(String p,String d){
        int resul = Integer.parseInt(d) * 2;
        return resul;
    }public static double db(String p,String d){
        double resul = Integer.parseInt(d) * 1.5;
        return resul;
    }public static String st(String p,String d){
        String resul = "";
        resul+="$";
        resul+=d;
        resul+="$";
        return resul;
    }
}
