package ATECHMODUL.Objects_and_Classes_Ex.Artlicles2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<Articles2> in = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(", ");
            String z = p[0];
            String t = p[1];
            String av = p[2];
            Articles2 vr = new Articles2(z,t,av);
            in.add(vr);
        }
        String cmd = scanner.nextLine();
        if(cmd.equals("title")){
            in
                    .stream()
                    .sorted((f,f1)->f.getZaglavie().compareTo(f1.getZaglavie()))
                    .forEach(f-> System.out.println(f.toString()));
        } if(cmd.equals("content")){
            in
                    .stream()
                    .sorted((f,f1)->f.getTekst().compareTo(f1.getTekst()))
                    .forEach(f-> System.out.println(f.toString()));
        } if(cmd.equals("author")){
            in
                    .stream()
                    .sorted((f,f1)->f.getAvtor().compareTo(f1.getAvtor()))
                    .forEach(f-> System.out.println(f.toString()));
        }
    }

}
