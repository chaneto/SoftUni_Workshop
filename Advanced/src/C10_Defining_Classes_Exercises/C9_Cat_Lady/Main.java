package C10_Defining_Classes_Exercises.C9_Cat_Lady;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Set<Street>> ulichna = new HashMap<>();
        while (true) {
            String[] p = scanner.nextLine().split(" ");
            if (p[0].equals("End")) {
                break;
            }
            String poroda = p[0];
            String name = p[1];
            double age = Double.parseDouble(p[2]);
            if (!ulichna.containsKey(poroda)) {
                Street street = new Street(poroda, name, age);
                ulichna.put(poroda, new HashSet<>());
                ulichna.get(poroda).add(street);
            } else {
                Street street = new Street(poroda, name, age);
                ulichna.get(poroda).add(street);
            }

        }
        String p = scanner.nextLine();
        for(Map.Entry<String,Set<Street>> out1 : ulichna.entrySet()){
            for( Street t : out1.getValue()){
                if(t.getName().equals(p)){
                    System.out.printf("%s %s %.2f%n",t.getPoroda(),t.getName(),t.getAge());
                }
            }
        }

    }
}
