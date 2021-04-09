import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broipatnicistart = Integer.parseInt(scanner.nextLine());
        int broizpirki = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 2* broizpirki; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                broipatnicistart += a;
            } else {
                broipatnicistart -= a;
            }

        }if(broizpirki % 2 != 0){
            broipatnicistart += 2;
        }
        System.out.println("The final number of passengers is : " + broipatnicistart );
    }
}
