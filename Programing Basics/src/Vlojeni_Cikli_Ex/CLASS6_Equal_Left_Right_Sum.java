package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS6_Equal_Left_Right_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        for (int i = a; i <= b; i++) {
            int total = i;
            int lqvo = 0;
            int dqsno= 0;
            int sredno = 0;
            for (int j = 0; j < 5 ; j++) {
                int num = total % 10;
                if(j == 0 || j == 1){
                    lqvo += num;
                }else if (j == 3 || j == 4){
                    dqsno += num;
                }else {
                    sredno = num;
                }total /= 10;

            }if(lqvo == dqsno){
                System.out.printf("%d ",i);
            }else if(lqvo < dqsno){
                lqvo += sredno;
                if(lqvo == dqsno){
                    System.out.printf("%d ",i);
                }
            }else if(dqsno < lqvo){
                dqsno += sredno;
                if(lqvo == dqsno){
                    System.out.printf("%d ",i);
                }
            }

        }
    }
}
