package C13_Reflection_and_Annotations.C5_Coding_Tracker;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {
    public static void printMethodsByAuthor(Class<?> clazz){
        Map<String, List<String>> methodsByAuthor = new HashMap<> ();
        Method[] declaredMethods = clazz.getDeclaredMethods ();
    }
}
