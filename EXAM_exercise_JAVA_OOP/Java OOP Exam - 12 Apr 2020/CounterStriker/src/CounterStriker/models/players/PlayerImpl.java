package CounterStriker.models.players;

import CounterStriker.models.guns.Gun;

public abstract class PlayerImpl implements Player{
    private String username;
    private int health;
    private int armor;
    private boolean isAlive;
    private Gun gun;

    protected PlayerImpl(String username, int health, int armor, Gun gun) {
        setUsername (username);
        setHealth (health);
        setArmor (armor);
        setAlive (isAlive);
        setGun (gun);
    }
    private void setUsername(String username) {
        if(username == null || username.trim ().isEmpty ()){
            throw new NullPointerException ("Username cannot be null or empty.");
        }
        this.username = username;
    }
     private void setHealth(int health) {
        if(health < 0){
            throw new IllegalArgumentException ("Player health cannot be below 0.");
        }
        this.health = health;
    }
    private void setArmor(int armor) {
        if(armor < 0){
            throw new IllegalArgumentException ( "Player armor cannot be below 0.");
        }
        this.armor = armor;
    }
    private void setAlive(boolean alive) {
        this.isAlive = true;
    }
    public void setGun(Gun gun) {
        if(gun == null){
            throw new NullPointerException ("Gun cannot be null.");
        }
        this.gun = gun;
    }
    @Override
    public String getUsername() {
        return this.username;
    }
    @Override
    public int getHealth() {
        return this.health;
    }
    @Override
    public int getArmor() {
        return this.armor;
    }
    @Override
    public Gun getGun() {
        return this.gun;
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void takeDamage(int points) {
        if(this.armor > 0){
        this.armor -= points;
        if(this.armor <= 0){
            this.health -= this.armor;
            this.armor = 0;
        }if(this.health <= 0){
            this.isAlive = false;
           }
        }else {
            this.health -= points;
            if(this.health <= 0){
                this.isAlive = false;
                this.health = 0;

            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        sb.append ( this.getClass ().getSimpleName () + ": " + getUsername () )
                .append (System.lineSeparator ())
                .append ("--Health: " + getHealth ())
                .append (System.lineSeparator ())
                .append ("--Armor: " + getArmor ())
                .append (System.lineSeparator ())
                .append ("--Gun: " + getGun ().getName ())
                .append (System.lineSeparator ());

        return sb.toString ();
    }
}
