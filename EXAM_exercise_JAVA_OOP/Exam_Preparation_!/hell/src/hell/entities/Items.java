package hell.entities;

import hell.interfaces.Item;

public abstract class Items implements Item {
    private String name;
    private int strengthBonus;
    private int agilityBonus;
    private int intelligenceBonus;
    private int hitPointsBonus;
    private int damageBonus;

    protected Items(String name, int strength, int agility, int intelligence, int hitPoints, int damage) {
        this.name = name;
        this.strengthBonus = strength;
        this.agilityBonus = agility;
        this.intelligenceBonus = intelligence;
        this.hitPointsBonus = hitPoints;
        this.damageBonus = damage;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getStrengthBonus() {
        return this.strengthBonus;
    }
    @Override
    public int getAgilityBonus() {
        return this.agilityBonus;
    }
    @Override
    public int getIntelligenceBonus() {
        return this.intelligenceBonus;
    }
    @Override
    public int getHitPointsBonus() {
        return this.hitPointsBonus;
    }
    @Override
    public int getDamageBonus() {
        return this.damageBonus;
    }
}
