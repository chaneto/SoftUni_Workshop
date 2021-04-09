package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C3_PassedorFiled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        if(a >= 3){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
