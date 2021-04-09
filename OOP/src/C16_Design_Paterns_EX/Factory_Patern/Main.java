package C16_Design_Paterns_EX.Factory_Patern;

import C16_Design_Paterns_EX.Factory_Patern.model.GameObject;
import C16_Design_Paterns_EX.Factory_Patern.model.Initializer;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<GameObject> gameObjects = Initializer.init ();
        boolean gameOver = false;
        while (!gameOver){
            for(GameObject out: gameObjects){
                out.update ();
                out.draw ();
                Thread.sleep (2000);
            }
            gameOver = 100 > 0;
        }

    }
}
