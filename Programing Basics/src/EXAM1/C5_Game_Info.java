package EXAM1;

import java.util.Scanner;

public class C5_Game_Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String otbor = scanner.nextLine();
        double broisreshti = Double.parseDouble(scanner.nextLine());
        double total = 0;
        double average = 0;
        double counterduzpi = 0;
        double counterprodaljeniq = 0;
        for (int i = 0; i < broisreshti; i++) {
            double time = Double.parseDouble(scanner.nextLine());
            total = total + time;
            average = total / broisreshti;
            if(time > 90 && time <= 120){counterprodaljeniq++;}
            if(time > 120){counterduzpi++;}


        }
        System.out.printf("%s has played %.0f minutes. Average minutes per game: %.2f%n",otbor, total, average);
        System.out.printf("Games with penalties: %.0f%n",counterduzpi);
        System.out.printf("Games with additional time: %.0f",counterprodaljeniq);
    }
}
