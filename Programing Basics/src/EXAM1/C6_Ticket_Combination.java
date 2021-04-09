package EXAM1;

import java.util.Scanner;

public class C6_Ticket_Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int counter = 0;
        for (char i = 'B'; i <= 'L'; i++) {
            if(i %2 == 0){
                for (char j = 'f'; j >= 'a'; j--) {
                    for (char k = 'A'; k <= 'C'; k++) {
                        for (int l = 1; l <= 10 ; l++) {
                            for (int m = 10; m >= 1 ; m--) {

                                counter++;
                                if(counter == a){
                                    System.out.printf("Ticket combination: %s%s%s%d%d%n",i,j,k,l,m);
                                    System.out.printf("Prize: %d lv.", i + j + k + l + m);
                                }

                            }

                        }

                    }

                }

            }

        }
    }
}
