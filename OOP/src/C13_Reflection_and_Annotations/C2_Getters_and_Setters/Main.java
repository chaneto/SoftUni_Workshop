package C13_Reflection_and_Annotations.C2_Getters_and_Setters;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;
        Set<Method> geters = new HashSet<> ();
        Set<Method> seters = new HashSet<> ();
        Method[] Methods = clazz.getDeclaredMethods ();
        for(Method out : Methods){
            if(out.getName ().startsWith ("get")){
                geters.add (out);
            }else if(out.getName ().startsWith ("set")) {
                seters.add (out);
            }
        }geters.stream ().sorted ((s,s1) -> s.getName ().compareTo (s1.getName ()))
                .forEach (f -> System.out.printf ("%s will return class %s%n",f.getName (),f.getReturnType ().getName ()));
        seters.stream ().sorted ((s,s1) -> s.getName ().compareTo (s1.getName ()))
                .forEach (f -> System.out.printf ("%s and will set field of class %s%n",f.getName (), f.getParameterTypes ()[0].getName ()));
    }
}
