package C15_Design_Patterns_Lab.C5_Command_Pattern;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private Map<String, Comand> commandMap;
    public Invoker(){
        this.commandMap = new HashMap<> ();
       this. commandMap.put ("PrintNameCommand", new PrintNameCommand ());
       this. commandMap.put ("PrintRandomNumber", new PrintRandomNumber ());
    }
    public void invoke(String typeCpmand){
        this.commandMap.get (typeCpmand).execute ();
    }
}
