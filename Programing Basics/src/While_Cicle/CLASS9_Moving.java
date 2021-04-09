package While_Cicle;

import java.util.Scanner;

public class CLASS9_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int broqch = 0;
        int obemkashta = weight * length * h;
        while (true) {
            String p = scanner.nextLine();
            if(p.equals("Done")){
                System.out.printf("%d Cubic meters left.",obemkashta);break;}
                int obemkashon = Integer.parseInt(p);
                obemkashta-=obemkashon;
            if(obemkashta<0){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(obemkashta));break;
            }
        }

    }
}