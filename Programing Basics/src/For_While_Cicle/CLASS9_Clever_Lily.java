package For_While_Cicle;

import java.util.Scanner;

public class CLASS9_Clever_Lily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double waschprice = Double.parseDouble(scanner.nextLine());
        int toyprice = Integer.parseInt(scanner.nextLine());
        double money = 0;
        double toy = 0;
        double reket = 0;
        for (int i = 1 ; i <= age; i++) {
            if(i %2 == 0){
               money += i*10/2;
               reket++;
            }else  {
                toy++;
            }

        }money = money + toy * toyprice;
        money = money - reket;
        if(money >= waschprice){
            System.out.printf("Yes! %.2f",money - waschprice);
        }else {
            System.out.printf("No! %.2f",waschprice - money);
        }


    }
}
