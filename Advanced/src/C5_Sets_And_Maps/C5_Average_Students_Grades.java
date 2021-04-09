package C5_Sets_And_Maps;

import java.util.*;

public class C5_Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> in = new TreeMap<>();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");
            String name = p[0];
            double grade = Double.parseDouble(p[1]);
            if (!in.containsKey(name)) {
                in.put(name, new ArrayList<>());
                in.get(name).add(grade);
            } else {
                in.get(name).add(grade);
            }
        }
        for(Map.Entry<String,List<Double>> out : in.entrySet()){
            System.out.printf("%s -> ",out.getKey());
            double avg = 0;
            for (int i = 0; i < out.getValue().size(); i++) {
                System.out.printf("%.2f ",out.getValue().get(i));
                avg += out.getValue().get(i);
            }
            System.out.printf("(avg: %.2f)%n",avg/out.getValue().size());
        }
    }
}
