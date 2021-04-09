package C11_solidLab.p05_DependencyInversion.p02_Worker;

import java.time.LocalDateTime;

public class Worker {
    public void work(){
        if (LocalDateTime.now().getHour()< 12) {
            System.out.println ("Worker is worked");
        }

        if (LocalDateTime.now().getHour() < 18) {
            System.out.println ("Worked is worked");
        }else {
        System.out.println ("Worker is not worked");
        }
    }
}
