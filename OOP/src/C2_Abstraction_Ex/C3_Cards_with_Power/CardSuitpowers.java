package C2_Abstraction_Ex.C3_Cards_with_Power;

public enum CardSuitpowers {
    CLUBS (0),
    DIAMONDS (13),
    HEARTS (26),
    SPADES (39);
    private int cardnummer;

    CardSuitpowers(int cardnummer) {
        this.cardnummer = cardnummer;
    }

    public int getCardnummer() {
        return cardnummer;
    }
}
