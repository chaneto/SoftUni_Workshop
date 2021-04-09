package C15_Design_Patterns_Lab.C5_Command_Pattern;

import java.util.concurrent.ThreadLocalRandom;

public class PrintRandomNumber implements Comand {

    @Override
    public void execute() {
        System.out.println (ThreadLocalRandom.current ().nextInt (19999));
    }
}
