package C16_Design_Paterns_EX.Factory_Patern.model;

public class Player implements GameObject {
    private int health;
    private int demage;

    public Player(int health, int demage) {
        this.health = health;
        this.demage = demage;
    }

    @Override
    public void update() {
        System.out.println ("Player updated");
    }

    @Override
    public void draw() {
        System.out.println ("Player renderen");
    }
}
