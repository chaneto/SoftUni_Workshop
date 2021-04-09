package C10_Defining_Classes_Exercises.C5_Car_Salesman;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Engine> engineMap = new HashMap<> ();
        List<Auto> output = new ArrayList<> ();
        int nummengine = Integer.parseInt (scanner.nextLine ());
        for (int i = 0; i < nummengine; i++) {
            String[] inputengine = scanner.nextLine ().split (" ");
            String model = inputengine[0];
            String power = inputengine[1];
            Engine engine;
            if(inputengine.length == 2){
                engine = new Engine (model,power);
                engineMap.put (model,engine);
            }else if(inputengine.length == 3){
                String word = inputengine[2];
                Character firstcase = word.charAt (0);
                if(Character.isDigit (firstcase)){
                    int displacement = Integer.parseInt (inputengine[2]);
                    engine = new Engine (model, power, displacement);
                    engineMap.put (model,engine);
                }else {
                    engine = new Engine (model,power,word);
                    engineMap.put (model,engine);
                }
            }else {
                int displasemant = Integer.parseInt (inputengine[2]);
                String efect = inputengine[3];
                engine = new Engine (model, power, displasemant, efect);
                engineMap.put (model,engine);
            }
        }
        int nummercar = Integer.parseInt (scanner.nextLine ());
        for (int i = 0; i < nummercar; i++) {
            String[] inputcar = scanner.nextLine ().split (" ");
            String model = inputcar[0];
            String engin = inputcar[1];
            Engine engine = engineMap.get (engin);
            Auto auto;
            if(inputcar.length == 2){
                auto = new Auto (model, engine);
                output.add (auto);
            }else if(inputcar.length == 3){
                try {
                    int weight = Integer.parseInt (inputcar[2]);
                    auto = new Auto (model, engine, weight);
                }catch (NumberFormatException e){
                    String color = inputcar[2];
                    auto = new Auto (model,  engine, color);
                }output.add (auto);
            }else {
                int weight = Integer.parseInt (inputcar[2]);
                String color = inputcar[3];
                auto = new Auto (model,engine,weight,color);
                output.add (auto);
            }
        }
        for (int i = 0; i < output.size (); i++) {
            System.out.println (output.get (i).getAutomodel () + ":");
            System.out.println (output.get (i).getEngine ().getModel () + ":");
            System.out.println ("Power: " + output.get (i).getEngine ().getPower ());
            if(output.get (i).getEngine ().getDispiacement () == 0){
                System.out.println ("Displacement: n/a");
            }else {
                System.out.println ("Displacement: " + output.get (i).getEngine ().getDispiacement ());
            }
            System.out.println ("Efficiency: " + output.get (i).getEngine ().getEfect ());
            if(output.get (i).getWieght () == 0){
                System.out.println ("Weight: n/a");
            }else {
                System.out.println ("Weight: " + output.get (i).getWieght ());
            }
            System.out.println ("Color: " + output.get (i).getColor ());
        }
    }
}
