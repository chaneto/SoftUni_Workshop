package Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS5_Passwort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        if(p.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
