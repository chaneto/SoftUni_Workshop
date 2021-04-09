package C1_Abstraction.C4_Hotel_Reservation;

public enum Discount {
    None(0),
    SecondVisit(10),
    VIP(20);
    private int Rabat;

    Discount(int rabat) {

        this.Rabat = rabat;
    }
    public double getRabat(){
        return (100 - this.Rabat) / 100.0;
    }
}
