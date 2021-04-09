import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int num1 = a % 10;
        a /= 10;
        int num2 = a % 10;
        a /= 10;
        int num3 = a % 10;
        for (int i = 1; i <= num1 ; i++) {
            for (int j = 1; j <= num2 ; j++) {
                for (int k = 1; k <= num3; k++) {
                    total = i * k * j;
                    System.out.printf("%d * %d * %d = %d;%n",i,j,k,total);
                }


            }

        }


    }
}
