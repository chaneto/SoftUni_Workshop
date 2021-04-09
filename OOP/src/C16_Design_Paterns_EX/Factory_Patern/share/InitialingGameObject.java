package C16_Design_Paterns_EX.Factory_Patern.share;

import C16_Design_Paterns_EX.Factory_Patern.Factory;
import C16_Design_Paterns_EX.Factory_Patern.model.GameObject;

import java.util.ArrayList;
import java.util.List;

public class InitialingGameObject implements ProductMultiply{
    private List<Factory> objectFactories;

    public InitialingGameObject() {
        this.objectFactories = new ArrayList<> ();
    }

    @Override
    public List<GameObject> produce() {
        List<GameObject> gameObjects = new ArrayList<> ();
        for(Factory out: objectFactories){
            gameObjects.add (out.produce ());
        }
        return gameObjects;
    }

    @Override
    public void setFactories(List<Factory> objectFactoryes) {
        this.objectFactories = objectFactoryes;
    }
}
