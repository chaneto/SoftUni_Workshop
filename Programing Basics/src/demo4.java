import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumgost = Integer.parseInt(scanner.nextLine());
        String p = scanner.nextLine();
        int total2 = 0;
        int total1 = 0;
        int broigosti = 0;
        int total = 0;
        while (!(p.equals("The restaurant is full"))) {
            int a = Integer.parseInt(p);
            broigosti += a;
            if (a < 5) {
                total2 += a * 100;
            } else {
                total1 += a * 70;
            }p = scanner.nextLine();

        }
        total = total1 + total2;
        if(total >= sumgost){
            System.out.printf("You have %d guests and %d leva left.",broigosti,total - sumgost);
        }else{
            System.out.printf("You have %d guests and %d leva income, but no singer.",broigosti,total);
        }
    }
}
