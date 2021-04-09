package C14_Exercises_Reflection.C2_Black_Box_Integer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, NoSuchFieldException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor (int.class);
        constructor.setAccessible (true);
        BlackBoxInt blackBoxInt = (BlackBoxInt) constructor.newInstance (0);
        Field innerValue = clazz.getDeclaredField ("innerValue");
        innerValue.setAccessible (true);
        while (true){
            String[] command = reader.readLine ().split ("_");
            if(command[0].equals ("END")){
                break;
            }
            String methood = command[0];
            int sum = Integer.parseInt (command[1]);
                Method method = (Method) clazz.getDeclaredMethod (methood,int.class);
                method.setAccessible (true);
                method.invoke (blackBoxInt,sum);
                System.out.println (innerValue.getInt (blackBoxInt));
        }
    }
}
