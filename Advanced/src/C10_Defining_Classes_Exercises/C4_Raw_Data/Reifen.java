package C10_Defining_Classes_Exercises.C4_Raw_Data;

public class Reifen {
    private double bar1;
    private int alt1;
    private double bar2;
    private int alt2;
    private double bar3;
    private int alt3;
    private double bar4;
    private int alt4;

    public Reifen(double bar1, int alt1, double bar2, int alt2, double bar3, int alt3, double bar4, int alt4) {
        this.bar1 = bar1;
        this.alt1 = alt1;
        this.bar2 = bar2;
        this.alt2 = alt2;
        this.bar3 = bar3;
        this.alt3 = alt3;
        this.bar4 = bar4;
        this.alt4 = alt4;
    }

    public double getBar1() {
        return bar1;
    }

    public int getAlt1() {
        return alt1;
    }

    public double getBar2() {
        return bar2;
    }

    public int getAlt2() {
        return alt2;
    }

    public double getBar3() {
        return bar3;
    }

    public int getAlt3() {
        return alt3;
    }

    public double getBar4() {
        return bar4;
    }

    public int getAlt4() {
        return alt4;
    }
}
