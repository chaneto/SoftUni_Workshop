package Aassociative_Array_Ex;

import java.util.*;

public class C10_SoftUni_Exam_Results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> input = new TreeMap<>();
        Map<String, List<String>> java = new TreeMap<>();
        while (true){
            String[] p = scanner.nextLine().split("-");
            if(p[0].equals("exam finished")){break;}
            String name = p[0];
            String ezik = p[1];
            if(p[1].equals("banned")){
                input.remove(name);
            }else {
                int tochki = Integer.parseInt(p[2]);
                if(!input.containsKey(name)){
                    input.put(name,tochki);
                }else {
                    if(input.get(name) < tochki){
                        input.put(name,tochki);
                    }
                }

                if(!java.containsKey(ezik)){
                    java.put(ezik,new ArrayList<>());
                    java.get(ezik).add(ezik);
                }else {
                    java.get(ezik).add(ezik);
                }
            }
        }
        System.out.println("Results:");
        input
                .entrySet()
                .stream()
                .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(f -> System.out.printf("%s | %d%n",f.getKey(),f.getValue()));
        System.out.println("Submissions:");
        java
                .entrySet()
                .stream()
                .sorted((s,s1) -> {
                    int n = s.getValue().size();
                    int n1 = s1.getValue().size();
                    return Integer.compare(n1,n);
                }  )
                .forEach(f -> System.out.printf("%s - %d%n",f.getKey(),f.getValue().size()));
    }
}
