package ATECHMODUL.EXAM;

import java.util.Scanner;

public class C4_1_MID_Counter_Strike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int counterout = 0;
       while (true) {
           String p = scanner.nextLine();
           if (p.equals("End of battle")) {
               break;
           }
           int in = Integer.parseInt(p);
           if(a < in){
               System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",counterout,a);
               return;
           }else {
               a -= in;
               counter++;
               counterout++;
               if(counter == 3){
                   a += counterout;
                   counter = 0;
               }
           }
       }
        System.out.printf("Won battles: %d. Energy left: %d",counterout,a);
    }
}
