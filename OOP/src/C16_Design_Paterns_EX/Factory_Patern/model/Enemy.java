package C16_Design_Paterns_EX.Factory_Patern.model;

public class Enemy implements GameObject{
    private int health;
    private int demage;

    public Enemy(int health, int demage) {
        this.health = health;
        this.demage = demage;
    }

    @Override
    public void update() {
        System.out.println ("Enemy uplodet");
    }

    @Override
    public void draw() {
        System.out.println ("Enemy rendered");
    }
}
