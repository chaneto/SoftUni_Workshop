package viceCity.models.guns;

public class Rifle extends BaseGun{
    private static final int BUllETS_Per_Barrel = 50;
    private static final int TOTAL_Bullets = 500;
    public Rifle(String name) {
        super (name, BUllETS_Per_Barrel, TOTAL_Bullets);
    }

}
