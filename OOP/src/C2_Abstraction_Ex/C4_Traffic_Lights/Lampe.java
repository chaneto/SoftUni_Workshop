package C2_Abstraction_Ex.C4_Traffic_Lights;

public enum Lampe {
    RED(0),
    GREEN(1),
    YELLOW(2);

    private int cardnummer;


    Lampe(int cardnummer) {
        this.cardnummer = cardnummer;
    }

    public int getCardnummer() {
        return cardnummer;
    }

    public void setCardnummer(int cardnummer) {
        this.cardnummer = cardnummer;
    }
}
