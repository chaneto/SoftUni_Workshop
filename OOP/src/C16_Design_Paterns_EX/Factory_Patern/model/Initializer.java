package C16_Design_Paterns_EX.Factory_Patern.model;

import C16_Design_Paterns_EX.Factory_Patern.Factory;
import C16_Design_Paterns_EX.Factory_Patern.data.DataStorage;
import C16_Design_Paterns_EX.Factory_Patern.share.EnemyFactory;
import C16_Design_Paterns_EX.Factory_Patern.share.InitialingGameObject;
import C16_Design_Paterns_EX.Factory_Patern.share.PlayerFactory;
import C16_Design_Paterns_EX.Factory_Patern.share.ProductMultiply;

import java.util.ArrayList;
import java.util.List;

public class Initializer {
    public static DataStorage dataStorage = new DataStorage ();
    public static ProductMultiply multiply = new InitialingGameObject ();
    public static List<Factory> objectFactory = new ArrayList<> ();
    public static List<GameObject> init(){
        objectFactory.add (new PlayerFactory ());
        objectFactory.add (new EnemyFactory ());
        multiply.setFactories(objectFactory);
        return multiply.produce ();
    }
}
