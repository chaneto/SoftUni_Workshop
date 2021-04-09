package C16_Design_Paterns_EX.Factory_Patern.share;

import C16_Design_Paterns_EX.Factory_Patern.Factory;
import C16_Design_Paterns_EX.Factory_Patern.model.GameObject;
import C16_Design_Paterns_EX.Factory_Patern.model.Initializer;
import C16_Design_Paterns_EX.Factory_Patern.model.Player;

public class PlayerFactory implements Factory {

    @Override
    public GameObject produce() {
      int[] params = Initializer.dataStorage.load (Player.class);
      return new Player (params[0], params[1]);
    }
}
