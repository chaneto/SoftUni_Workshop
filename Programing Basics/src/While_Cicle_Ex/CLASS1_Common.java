package While_Cicle_Ex;

import java.util.Scanner;

public class CLASS1_Common {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int resul = 0;
        if(b == 0);{
        resul = a;}
        while(b!=0){
            resul = b;
            b = a%b;
            a = resul;
        }
        System.out.println(resul);

    }
}
