package Aassociative_Array_Ex;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C3_Andere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> elements = new TreeMap<>();{
            elements.put("shards",0);
            elements.put("fragments",0);
            elements.put("motes",0);
        }
        Map<String,Integer> rest = new TreeMap<>();
        int sum = 0;
        String name = "";
        while (true){
            String[] cmd = scanner.nextLine().split(" ");
            for (int i = 0; i < cmd.length; i+=2) {
                sum = Integer.parseInt(cmd[i]);
                name = cmd[i + 1].toLowerCase();
                if(name.equals("shards")){
                    result(name,sum,elements);
                    if(elements.get(name) >= 250){
                        System.out.println("Shadowmourne obtained!");
                        int b = elements.get(name);
                        if(b >= 250){
                            b -= 250;
                            elements.put(name,b);
                        }
                        print(elements);
                        printrest(rest);
                        return;
                    }
                }else if(name.equals("fragments")){
                    result(name,sum,elements);
                    if(elements.get(name) >= 250){
                        System.out.println("Valanyr obtained!");
                        int b = elements.get(name);
                        if(b >= 250){
                            b -= 250;
                            elements.put(name,b);
                        }
                        print(elements);
                        printrest(rest);
                        return;
                    }
                }else if(name.equals("motes")){
                    result(name,sum,elements);
                    if(elements.get(name) >= 250){
                        System.out.println("Dragonwrath obtained!");
                        int b = elements.get(name);
                        if(b >= 250){
                            b -= 250;
                            elements.put(name,b);
                        }
                        print(elements);
                        printrest(rest);
                        return;
                    }
                }else {
                    result(name,sum,rest);
                }

            }
        }
    }public static void result (String name,Integer sum,Map<String,Integer> p){
        if(!p.containsKey(name)){
            p.put(name,sum);
        }else {
            int a = p.get(name);
            p.put(name,a + sum);
        }
    }public static void print(Map<String,Integer> p){
        p
                .entrySet()
                .stream()
                .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(f -> System.out.printf("%s: %d%n",f.getKey(),f.getValue()));

    }public static void printrest(Map<String,Integer> p1){
        p1
                .entrySet()
                .forEach(f -> System.out.printf("%s: %d%n",f.getKey(),f.getValue()));

    }
}
