package C13_Reflection_and_Annotations.C1_Reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args)
            throws
            ClassNotFoundException,
            IllegalAccessException,
            InstantiationException,
            NoSuchMethodException,
            InvocationTargetException {
        Class<Reflection> clazz = Reflection.class;
        String simpleName = clazz.getSimpleName ();
        System.out.println (clazz.toString ());
        Class<?> superclass = clazz.getSuperclass ();
        System.out.println (superclass);
        Class<?>[] interfaces = clazz.getInterfaces ();
        for(Class out : interfaces){
            System.out.println ("interface " + out.getName ());
        }
        Reflection reflection = clazz.getDeclaredConstructor ().newInstance ();
        System.out.println (reflection.toString ());
    }
}
