package ATECHMODUL.Exercise_BasycSyntax;

import java.util.Scanner;

public class C4_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String u = scanner.nextLine();
        String p = "";
        int counter = 0;
        for (int i = 0; i < u.length() ; i++) {
            p += u.charAt(u.length() - i - 1);
            
        }

        while (true){
            String a = scanner.nextLine();
            counter++;
            if(p.equals(a)){
                System.out.printf("User %s logged in.",u);break;
            }else if (a != p) {
                System.out.printf("Incorrect password. Try again.%n");

            }if(counter > 2){
                System.out.printf("User %s blocked!",u);break;
            }

        }

        
    }
}
