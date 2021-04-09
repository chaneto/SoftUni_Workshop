package C13_Reflection_and_Annotations.C3_High_Quality_Mistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;
        Set<Method> geters = new HashSet<> ();
        Set<Method> seters = new HashSet<> ();
        Set<Field> felds = new HashSet<> ();
        Field[] declaredFields = clazz.getDeclaredFields ();
        for(Field out : declaredFields){
            if(!Modifier.isPrivate (out.getModifiers ())){
                felds.add (out);
            }
        }
        Method[] Methods = clazz.getDeclaredMethods ();
        for(Method out : Methods){
            if(out.getName ().startsWith ("get")){
                if(!Modifier.isPublic (out.getModifiers ())){
                geters.add (out);
                }
            }else if(out.getName ().startsWith ("set")) {
                if(!Modifier.isPrivate (out.getModifiers ())){
                seters.add (out);}
            }
        }felds.stream ().sorted ((s,s1) -> s.getName ().compareTo (s1.getName ()))
                .forEach (f -> System.out.printf ("%s must be private!%n",f.getName ()));
        geters.stream ().sorted ((s,s1) -> s.getName ().compareTo (s1.getName ()))
                .forEach (f -> System.out.printf ("%s have to be public!%n",f.getName ()));
        seters.stream ().sorted ((s,s1) -> s.getName ().compareTo (s1.getName ()))
                .forEach (f -> System.out.printf ("%s have to be private!%n",f.getName ()));
    }
}
