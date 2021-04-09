package ATECHMODUL.Method_more_Ex;

import java.util.Scanner;

public class C1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String b = scanner.nextLine();
        data(p,b);
    }public static void data(String p,String b){
        double sum = 0;
        if(p.equals("int")){
            sum = Integer.parseInt(b) * 2;
            System.out.printf("%.0f",sum);
        }
        if(p.equals("real")){
            sum = Integer.parseInt(b) * 1.5;
            System.out.printf("%.2f",sum);
        }if(p.equals("string")){
            String win = "";
            win+="$";
            win+=b;
            win+="$";
            System.out.println(win);
        }
    }
}
