package C14_Exercises_Reflection.C1_Harvesting_Fields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		while (true){
            String command = reader.readLine ();
            if(command.equals ("HARVEST")){
                break;
            }
            Class<RichSoilLand> clazz = RichSoilLand.class;
            Field[] fields = clazz.getDeclaredFields ();
            for(Field out : fields){
                if(command.equals ("private")){
                    if(Modifier.isPrivate (out.getModifiers ())){
                        System.out.printf ("%s %s %s%n",
                                Modifier.toString (out.getModifiers ()), out.getType ().getSimpleName (), out.getName ());
                    }
                }else if(command.equals ("public")){
                    if(Modifier.isPublic (out.getModifiers ())){
                        System.out.printf ("%s %s %s%n",
                                Modifier.toString (out.getModifiers ()), out.getType ().getSimpleName (), out.getName ());
                    }
                }else if(command.equals ("protected")){
                    if(Modifier.isProtected (out.getModifiers ())){
                        System.out.printf ("%s %s %s%n",
                                Modifier.toString (out.getModifiers ()), out.getType ().getSimpleName (), out.getName ());
                    }
                }else {
                    System.out.printf ("%s %s %s%n",
                            Modifier.toString (out.getModifiers ()), out.getType ().getSimpleName (), out.getName ());
                }
            }
        }
	}
}
