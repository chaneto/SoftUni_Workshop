package Aassociative_Array_Ex;

import java.util.*;

public class C6_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> input = new LinkedHashMap<>();
        while (true){
            String[] p = scanner.nextLine().split(" : ");
            if(p[0].equals("end")){break;}
            String course = p[0];
            String name = p[1];
            input.putIfAbsent(course,new ArrayList<>());
            input.get(course).add(name);
        }
        input.entrySet()
                .stream()
                .sorted((f,f1) -> {
                    int first = f.getValue().size();
                    int second = f1.getValue().size();
                    return Integer.compare(second,first); })
                .forEach(f -> {
                    System.out.println(String.format("%s: %d",f.getKey(),f.getValue().size()));
                    f.getValue()
                            .stream()
                            .sorted((n,n1) -> n.compareTo(n1) )
                            .forEach(m -> System.out.printf("-- %s%n",m));
                });
    }
}
