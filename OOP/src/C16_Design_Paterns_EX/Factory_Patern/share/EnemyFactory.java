package C16_Design_Paterns_EX.Factory_Patern.share;

import C16_Design_Paterns_EX.Factory_Patern.Factory;
import C16_Design_Paterns_EX.Factory_Patern.model.Enemy;
import C16_Design_Paterns_EX.Factory_Patern.model.GameObject;
import C16_Design_Paterns_EX.Factory_Patern.model.Initializer;

public class EnemyFactory implements Factory {

    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load (Enemy.class);
        return new Enemy (params[0], params[1]);
    }
}
