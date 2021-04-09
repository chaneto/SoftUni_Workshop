package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS1_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        for (int i = a; i <= b ; i++)
        {
            for (int j = a; j <= b ; j++)
            {
                if(i != j)

                {
                    for (int k = c; k <= d ; k++)
                    {
                        for (int l = c; l <= d ; l++)
                        {
                            if(k != l)
                            {
                                if (i + l == j + k) ;
                                {
                                System.out.printf("%d%d%n", i, j);
                                System.out.printf("%d%d%n", k, l);
                                System.out.println();
                                }
                            }

                        }

                    }
                }

            }
            
        }
    }
}
