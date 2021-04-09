package EXAM1;

import java.util.Scanner;

public class C4_Group_Stage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String otbor = scanner.nextLine();
        int broimacove = Integer.parseInt(scanner.nextLine());
        int tochki = 0;
        int goo = 0;
        int gool = 0;
        for (int i = 0; i < broimacove; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            goo = a - b;
            gool = gool + (goo);
            if(goo > 0){
                tochki += 3;
            }if(goo == 0){
                tochki += 1;
            }if(goo < 0){
                tochki += 0;
            }

        }if(gool >= 0){
            System.out.printf("%s has finished the group phase with %d points.%n",otbor,tochki);
            System.out.printf("Goal difference: %d.",gool);
        }else {
            System.out.printf("%s has been eliminated from the group phase.%n",otbor);
            System.out.printf("Goal difference: %d.",gool);
        }

    }
}
