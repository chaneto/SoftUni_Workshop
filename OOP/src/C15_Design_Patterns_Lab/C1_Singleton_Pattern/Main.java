package C15_Design_Patterns_Lab.C1_Singleton_Pattern;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> capitals = new HashMap<> ();
        capitals.put ("Sofia", 2000);
        capitals.put ("Varna", 1000);
        SingletonDataContainer instance = SingletonDataContainer.getInstance ();
        System.out.println (instance.getPopulation (capitals, "Sofia"));
        SingletonDataContainer instance1 = SingletonDataContainer.getInstance ();
        System.out.println (instance.getPopulation (capitals, "Varna"));
    }
}
