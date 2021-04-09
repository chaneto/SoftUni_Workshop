package C16_Design_Paterns_EX.Factory_Patern.data;

import C16_Design_Paterns_EX.Factory_Patern.model.Enemy;
import C16_Design_Paterns_EX.Factory_Patern.model.Player;

import java.util.HashMap;
import java.util.Map;

public class DataStorage {
    private Map<Class<?>, int[]> objectData;

    public DataStorage() {
        this.objectData = new HashMap<> ();
        this.objectData.putIfAbsent (Player.class, new int[]{100,50});
        this.objectData.putIfAbsent (Enemy.class, new int[]{305,35});
    }

    public  int[] load(Class<?> clazz){
        return this.objectData.get (clazz);
    }
}
