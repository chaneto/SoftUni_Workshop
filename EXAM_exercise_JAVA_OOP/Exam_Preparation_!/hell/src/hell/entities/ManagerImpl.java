package hell.entities;

import hell.interfaces.Hero;
import hell.interfaces.Manager;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerImpl implements Manager {
    private Map<String, Hero> heroMap;

    public ManagerImpl() {
        this.heroMap = new HashMap<> ();
    }

    @Override
    public String addHero(List<String> arguments) {
        Hero hero = null;
        if(arguments.get (1).equals ("Barbarian")){
            hero = new Barbarian (arguments.get (0));
        }else if(arguments.get (1).equals ("Assassin")){
            hero = new Assassin (arguments.get (0));
        }else if(arguments.get (1).equals ("Wizard")){
            hero = new Wizard (arguments.get (0));
        }this.heroMap.put (arguments.get (0), hero);
        return String.format ("Created %s - %s", arguments.get (1),arguments.get (0));
    }

    @Override
    public String addItem(List<String> arguments) {
        Item item = new CommonItem (arguments.get (0), Integer.parseInt (arguments.get (2)),
                Integer.parseInt (arguments.get (3)), Integer.parseInt (arguments.get (4)), Integer.parseInt (arguments.get (5))
                ,Integer.parseInt (arguments.get (6)));

        this.heroMap.get (arguments.get (1)).addItem (item);
        return String.format ("Added item - %s to Hero - %s", item.getName (), arguments.get (1));
    }

    @Override
    public String addRecipe(List<String> arguments) {
        Hero hero = heroMap.get (arguments.get (1));
        Recipe recipeItem = new RecipeItem (arguments.get (0), Integer.parseInt (arguments.get (2)),
                Integer.parseInt (arguments.get (3)), Integer.parseInt (arguments.get (4)), Integer.parseInt (arguments.get (5))
                ,Integer.parseInt (arguments.get (6)));
        for (int i = 7; i < arguments.size (); i++) {
            recipeItem.getRequiredItems ().add (arguments.get (i));
        }this.heroMap.get (arguments.get (1)).addRecipe (recipeItem);
        return String.format ("Added recipe - %s to Hero - %s",arguments.get (0), arguments.get (1));
    }

    @Override
    public String inspect(List<String> arguments) throws NoSuchFieldException, IllegalAccessException {
        Hero hero = this.heroMap.get (arguments.get (0));
        StringBuilder sb = new StringBuilder ();
        sb.append (String.format ("Hero: %s, Class: %s%n" +
                "HitPoints: %d, Damage: %d%n" +
                "Strength: %d%n" +
                "Agility: %d%n" +
                "Intelligence: %d%n", hero.getName (), hero.getClass ().getSimpleName (),
                hero.getHitPoints (), hero.getDamage (), hero.getStrength (), hero.getAgility (), hero.getIntelligence ()));
        if(hero.getItems ().isEmpty ()){
            sb.append ("Items: None");
        }else {
            sb.append ("Items:");
        for(Item out: hero.getItems ()){
            sb.append (System.lineSeparator ());
        sb.append (String.format ("###Item: %s%n" +
                "###+%d Strength%n" +
                "###+%d Agility%n" +
                "###+%d Intelligence%n" +
                "###+%d HitPoints%n" +
                "###+%d Damage%n",out.getName (), out.getStrengthBonus (), out.getAgilityBonus (),
                out.getIntelligenceBonus (), out.getHitPointsBonus (), out.getDamageBonus ()));
          }
        }
        return sb.toString ().trim ();
    }

    @Override
    public String quit() {
        StringBuilder sb = new StringBuilder ();
        int[] count = {1};
        heroMap.values ().stream ().sorted ((s1, s2) -> {
            int result = Long.compare ((s2.getAgility ()+s2.getStrength ()+s2.getIntelligence ())
                    , (s1.getAgility ()+s1.getStrength ()+s1.getIntelligence ()));
            if(result == 0){
                result = Long.compare ((s2.getDamage ()+s2.getHitPoints ()), (s1.getDamage ()+s1.getHitPoints ()));
            }return result;
        })
                .forEach (f -> {
                   sb.append (String.format ("%d. %s: %s%n" +
                           "###HitPoints: %d%n" +
                           "###Damage: %d%n" +
                           "###Strength: %d%n" +
                           "###Agility: %d%n" +
                           "###Intelligence: %d%n",count[0],f.getClass ().getSimpleName (), f.getName (),
                           f.getHitPoints (), f.getDamage (), f.getStrength (), f.getAgility (), f.getIntelligence ()));
                    count[0]++;
                    int counter = 0;
                    try {
                        counter = f.getItems ().size ();
                    } catch (NoSuchFieldException | IllegalAccessException e) {
                        e.printStackTrace ();
                    }
                    if(counter == 0){
                        sb.append ("###Items: None");
                    }else {
                        sb.append ("###Items: ");
                        try {
                            for(Item out: f.getItems ()){
                                if(counter > 1){
                                    sb.append (String.format ("%s, ",out.getName ()));
                                }else {
                                    sb.append (out.getName ());
                                }
                                counter--;
                               }
                        } catch (NoSuchFieldException | IllegalAccessException e) {
                            e.printStackTrace ();
                        }
                    }sb.append (System.lineSeparator ());
                });
        return sb.toString ().trim ();
    }
}
