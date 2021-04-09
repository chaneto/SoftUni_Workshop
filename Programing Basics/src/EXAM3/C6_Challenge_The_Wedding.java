package EXAM3;

import java.util.Scanner;

public class C6_Challenge_The_Wedding {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int men = Integer.parseInt(scanner.nextLine());
            int women = Integer.parseInt(scanner.nextLine());
            int table = Integer.parseInt(scanner.nextLine());
            int counter = 0;
            for (int i = 1; i <= men ; i++) {
                for (int j = 1; j <= women; j++) {
                    if(counter >= table)break;
                    System.out.printf("(%d <-> %d) ", i, j);
                    counter++;

                }

            }
        }
    }

