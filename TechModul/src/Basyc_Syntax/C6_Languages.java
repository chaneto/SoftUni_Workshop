package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C6_Languages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        if(p.equals("USA") || p.equals("England")){
            System.out.println("English");
        }if(p.equals("Spain") || p.equals("Argentina") || p.equals("Mexico")){
            System.out.println("Spanish");
        }if(!(p.equals("Spain") || p.equals("Argentina") || p.equals("Mexico") || p.equals("USA") || p.equals("England") )){
            System.out.println("unknown");
        }
    }

}
