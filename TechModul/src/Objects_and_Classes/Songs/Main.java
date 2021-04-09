package ATECHMODUL.Objects_and_Classes.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<Songs> songs = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split("_");
            String type = p[0];
            String name = p[1];
            String time = (p[2]);
            Songs song = new Songs(type, name, time);
            songs.add(song);

        }
        String p = scanner.nextLine();
        for (int i = 0; i < songs.size(); i++) {
            Songs potok = songs.get(i);
            if(p.equals(potok.getTypelist())){
                System.out.printf("%s%n",potok.getName());
            }if(p.equals("all")) {
                System.out.printf("%s%n",potok.getName());
            }
        }
    }
}
