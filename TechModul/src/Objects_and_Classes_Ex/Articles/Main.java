package ATECHMODUL.Objects_and_Classes_Ex.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(", ");
        String zag = p[0];
        String tekst = p[1];
        String avtor = p[2];
        Articles in = new Articles(zag,tekst,avtor);
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++) {
            String[] cmd = scanner.nextLine().split(": ");
            if(cmd[0].equals("Edit")){
                in.setTekst(cmd[1]);
            }if(cmd[0].equals("ChangeAuthor")){
                in.setAvtor(cmd[1]);
            }if(cmd[0].equals("Rename")){
                in.setZaglavie(cmd[1]);
            }
        }
        System.out.println(in);
    }
}
