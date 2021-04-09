package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS6_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int totall = 0;
        int totald = 0;
        for (int i = a; i <= b ; i++) {
            total = i;
            int d = total % 10;
            total = total / 10;
            int d1 = total % 10;
            total = total / 10;
            int m = total % 10;
            total = total / 10;
            int l = total % 10;
            total = total / 10;
            int l1 = total % 10;
            totald = d + d1;
            totall = l + l1;
            if(totald < totall){
                totald += m;
            }else if (totall < totald)
            {totall += m;
            }
            if(totald == totall){
                System.out.print(i + " ");
            }


        }
    }
}
