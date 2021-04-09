package EXAM3;

import java.util.Scanner;

public class C6_Wedding_Seats {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            char sector = scanner.nextLine().charAt(0);
            int red = Integer.parseInt(scanner.nextLine());
            int mesta = Integer.parseInt(scanner.nextLine());
            int counter = 0;
            int mesta1 = 0;
            for (char i = 'A'; i <= sector ; i++) {
                for (int j = 1; j <= red ; j++) {
                    if(j % 2 == 0){
                        mesta1 = mesta + 2;
                    }else {
                        mesta1 = mesta;
                    }
                    for (char k = 'a'; k <= 'a' + mesta1 - 1; k++) {
                        System.out.printf("%c%d%c%n",i,j,k);
                        counter++;

                    }

                }red += 1;

            }
            System.out.println(counter);

        }
    }

