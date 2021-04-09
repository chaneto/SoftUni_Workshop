package Uslovni_Konstrukcii_Ex;

import java.util.Scanner;

public class CLASS7_Scholar_Ship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dohod = Double.parseDouble(scanner.nextLine());
        double uspeh = Double.parseDouble(scanner.nextLine());
        double minrabz = Double.parseDouble(scanner.nextLine());
        double socst = minrabz*0.35;
        double stu = uspeh*25;
        if(dohod<minrabz && uspeh>4.50 && uspeh<5.50){
            System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socst));
        }else if (uspeh>=5.50&&stu>socst) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN",Math.floor(stu));
        }else if(dohod<minrabz && uspeh>=5.50 && socst>stu ){
            System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socst));
        }else if (dohod>minrabz && uspeh>=5.50){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",Math.floor(stu));
        }else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
