package viceCity.models.guns;

public abstract class BaseGun implements Gun{
    private String name;
    private int bulletsPerBarrel;
    private int totalBullets;
    private  boolean canFire;

    protected BaseGun(String name, int bulletsPerBarrel, int totalBullets) {
        setName (name);
        setBulletsPerBarrel (bulletsPerBarrel);
        setTotalBullets (totalBullets);
    }

    public void setName(String name) {
        if(name == null || name.trim ().isEmpty ()){
            throw new NullPointerException ("Name cannot be null or whitespace!");
        }
        this.name = name;
    }

    public void setBulletsPerBarrel(int bulletsPerBarrel) {
        if(bulletsPerBarrel < 0){
            throw new IllegalArgumentException ("Bullets cannot be below zero!");
        }
        this.bulletsPerBarrel = bulletsPerBarrel;
    }

    public void setTotalBullets(int totalBullets) {
        if(totalBullets < 0){
            throw new IllegalArgumentException ("Total bullets cannot be below zero!");
        }
        this.totalBullets = totalBullets;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBulletsPerBarrel() {
        return this.bulletsPerBarrel;
    }

    @Override
    public boolean canFire() {
        if(getTotalBullets () >= getBulletsPerBarrel ()){
            return true;
        }else {
        return false;
        }
    }

    @Override
    public int getTotalBullets() {
        return this.totalBullets;
    }

    @Override
    public int fire() {
        int fire = 0;
        if(this.getClass ().getSimpleName ().equals ("Rifle")){
            if(canFire ()){
                fire = 50;
                this.totalBullets -= getBulletsPerBarrel ();
            }
        }else if(this.getClass ().getSimpleName ().equals ("Pistol")){
            if(canFire ()){
                fire = 10;
                this.totalBullets -= getBulletsPerBarrel ();
            }
        }
        return fire;
    }
}
