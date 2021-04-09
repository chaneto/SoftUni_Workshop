package C2_Abstraction_Ex.C3_Cards_with_Power;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String rank = scanner.nextLine ();
        String suit = scanner.nextLine ();
        System.out.printf ("Card name: %s of %s; Card power: %d",CardsRankpowers.valueOf (rank)
        ,CardSuitpowers.valueOf (suit)
        ,CardSuitpowers.valueOf (suit).getCardnummer () + CardsRankpowers.valueOf (rank).getCardnummer ());
    }
}
