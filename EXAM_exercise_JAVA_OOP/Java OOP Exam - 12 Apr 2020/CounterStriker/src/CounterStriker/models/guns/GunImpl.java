package CounterStriker.models.guns;

public abstract class GunImpl implements Gun{
    private String name;
    private int bulletsCount;

    protected GunImpl(String name, int bulletsCount) {
        setName (name);
        setBulletsCount (bulletsCount);
    }
    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name == null || name.trim ().isEmpty ()){
            throw new NullPointerException("Gun cannot be null or empty.");
        }
        this.name = name;
    }
    private void setBulletsCount(int bulletsCount) {
        if(bulletsCount < 0){
            throw new IllegalArgumentException("Bullets cannot be below 0.");
        }
        this.bulletsCount = bulletsCount;
    }
    @Override
    public int getBulletsCount() {
        return bulletsCount;
    }

    @Override
    public int fire() {
        int fire = 0;
        if(this.getClass ().getSimpleName ().equals ("Pistol")){
            if(getBulletsCount () > 0){
                fire = 1;
                this.bulletsCount -= 1;
            }
        }else if(this.getClass ().getSimpleName ().equals ("Rifle")){
            if(getBulletsCount () >= 10){
                fire = 10;
                this.bulletsCount -= 10;
            }
        }return fire;
    }

}
