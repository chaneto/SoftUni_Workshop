package While_Cicle;

import java.util.Scanner;

public class CLASS4_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int total = 0;
        total += a;
        while (total < 10000){
            String p = scanner.nextLine();
            if(p.equals("Going home")){
                int b = Integer.parseInt(p);
                System.out.printf("%d hshshshshssh",total+b);break;
            }



        }
    }
}
