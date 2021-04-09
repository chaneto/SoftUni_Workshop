package viceCity.models.guns;

public class Pistol extends BaseGun{
private static final int BUllETS_Per_Barrel = 10;
private static final int TOTAL_Bullets = 100;
    public Pistol(String name) {
        super (name, BUllETS_Per_Barrel, TOTAL_Bullets);
    }
}
