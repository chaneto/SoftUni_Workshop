import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double parihrana = Double.parseDouble(scanner.nextLine());
        double parisuveniri = Double.parseDouble(scanner.nextLine());
        double parihotel = Double.parseDouble(scanner.nextLine());
        double razhod = 420 * 7 ;
        double r = razhod / 100;
        double sumgorivo = r * 1.85;
        double sumhrana = parihrana * 3;
        double sumsuveniri = parisuveniri * 3;
        double hotel1 = parihotel - parihotel * 0.10;
        double hotel2 = parihotel - parihotel * 0.15;
        double hotel3 = parihotel - parihotel * 0.20;
        double sumhotel = hotel1 + hotel2 + hotel3;
        double total = sumgorivo + sumhrana + sumhotel + sumsuveniri;
        System.out.printf("Money needed: %.2f",total);

    }

}