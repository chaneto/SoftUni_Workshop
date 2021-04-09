package C16_Design_Paterns_EX.Factory_Patern.share;

import C16_Design_Paterns_EX.Factory_Patern.Factory;
import C16_Design_Paterns_EX.Factory_Patern.model.GameObject;

import java.util.List;

public interface ProductMultiply {
    List<GameObject> produce();

  void setFactories(List<Factory> objectFactory);
}
