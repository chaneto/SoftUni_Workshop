package C7_INTERFACES_AND_ABSTRACTION.BorderControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        List<Identifiable> output = new ArrayList<> ();
        while (true){
            String[] input = reader.readLine ().split (" ");
            if(input[0].equals ("End")){
                break;
            }Identifiable identifiable = null;
            if(input.length == 2){
                identifiable = new Robot (input[0], (input[1]));
                output.add (identifiable);
            }else {
                identifiable = new Citizen (input[0],Integer.parseInt (input[1]),input[2]);
                output.add (identifiable);
            }
        }
        String model = reader.readLine ();
        for (int i = 0; i < output.size (); i++) {
            if(output.get (i).getId ().endsWith (model)){
                System.out.println (output.get (i).getId ());
            }
        }
    }
}
