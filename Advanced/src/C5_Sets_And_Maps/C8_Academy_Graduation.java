package C5_Sets_And_Maps;

import java.text.DecimalFormat;
import java.util.*;

public class C8_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String,Double> in = new TreeMap<>();
        for (int i = 0; i < a; i++) {
            String name = scanner.nextLine();
            double[] ocenka = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double avg = 0;
            for (int j = 0; j < ocenka.length; j++) {
                avg += ocenka[j];
            }avg = avg / ocenka.length;
            if(!in.containsKey(name)){
                in.put(name,avg);
            }
        }in.entrySet().stream()
                .forEach(f -> {
                    System.out.printf("%s is graduated with ",f.getKey());
                    DecimalFormat format = new DecimalFormat("0.####################");
                    System.out.println(format.format(f.getValue()));
                });
    }
}
