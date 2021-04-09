package C15_Design_Patterns_Lab.C1_Singleton_Pattern;

import java.util.HashMap;
import java.util.Map;

public class SingletonDataContainer implements SingeltonConteiner{
    private static SingletonDataContainer instance;
    private Map<String, Integer> capitals;

    private SingletonDataContainer() {
        this.capitals = new HashMap<> ();
        System.out.println ("Initialing singelton object");
    }

    @Override
    public int getPopulation(Map<String, Integer> capitals, String name) {
        return capitals.get (name);
    }
    public static SingletonDataContainer getInstance(){
        if(instance != null){
            return instance;
        }else {
            instance = new SingletonDataContainer ();
            return instance;
        }
    }
}
