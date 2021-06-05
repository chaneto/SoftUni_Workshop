package entities;

import interfaces.Engine;
import interfaces.Manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EngineImpl implements Engine {
    private Manager manager;
    private BufferedReader bufferedReader;

    public EngineImpl() {
        this.manager = new ManagerImpl ();
        this.bufferedReader = new BufferedReader(new InputStreamReader (System.in));
    }

    @Override
    public void run() {
        String[] p = null;
        List<String> list = null;

        while (true){
            try {
                p = bufferedReader.readLine ().split (" ");
                list = Arrays.stream (p).skip (1).collect(Collectors.toList());
            } catch (IOException e) {
                e.printStackTrace ();
            }
            if(p[0].equals ("Quit")){
                System.out.println (this.manager.quit ());
                return;
            }else if(p[0].equals ("Hero")){
                System.out.println (this.manager.addHero (list));
            }else if(p[0].equals ("Item")){
                System.out.println (this.manager.addItem (list));
            }else if(p[0].equals ("Recipe")){
                System.out.println (this.manager.addRecipe (list));
            }
            else if(p[0].equals ("Inspect")){
                try {
                    System.out.println (this.manager.inspect(list));
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace ();
                }
            }
        }

    }
}
