package While_Cicle_Ex;

import java.util.Scanner;

public class CLASS_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int totalpices = 0;
        int torta = a * b;
        while(torta >= totalpices){
            String p = scanner.nextLine();
            if(p.equals("STOP")){
                System.out.printf("%d pieces are left.",torta - totalpices);break;
            }Integer p1 = Integer.parseInt(p);
            totalpices+=p1;
            if(totalpices>torta){
                System.out.printf("No more cake left! You need %d pieces more.",totalpices - torta);break;

            }

        }

    }
}
