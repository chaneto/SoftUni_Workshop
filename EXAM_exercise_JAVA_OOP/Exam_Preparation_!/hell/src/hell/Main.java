package hell;

import hell.interfaces.Engine;
import hell.entities.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl ();
        engine.run();
    }
}