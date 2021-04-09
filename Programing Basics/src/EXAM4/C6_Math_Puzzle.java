package EXAM4;

import java.util.Scanner;

public class C6_Math_Puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        boolean total = false;
        boolean total1 = false;
        int a1 = 0;
            if (a > 30) {
                a1 = 30;
            } else {
                a1 = a;
            }
            for (int i = 1; i <= a1; i++) {
                for (int j = 1; j <= a1; j++) {
                    for (int k = 1; k <= a1; k++) {
                        if (i < j && j < k) {
                            if (i + j + k == a) {
                                total = true;
                                System.out.printf("%d + %d + %d = %d%n", i, j, k, a);
                            }
                        }if (i > j && j > k) {
                            if (i * j * k == a) {
                                total1 = true;
                                System.out.printf("%d * %d * %d = %d%n", i, j, k, a);
                            }
                        }

                    }

                }
            }if(total == false && total1 == false){
            System.out.println("No!");
        }

        }


    }

