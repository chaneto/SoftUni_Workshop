package ATECHMODUL.Objects_and_Classes_Ex;

import java.util.Random;
import java.util.Scanner;

public class C1_Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int br = Integer.parseInt(scanner.nextLine());
        String[] phrase = new String[] {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"}
                ;
        String[] city = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random rnd = new Random();
        for (int i = 0; i < br; i++) {
            int f = rnd.nextInt(phrase.length);
            int e = rnd.nextInt(events.length);
            int a = rnd.nextInt(author.length);
            int c = rnd.nextInt(city.length);
            System.out.println(phrase[f] + events[e] + author[a] + city[c]);
        }

    }

}
