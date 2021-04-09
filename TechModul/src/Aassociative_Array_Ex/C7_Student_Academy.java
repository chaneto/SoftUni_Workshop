package Aassociative_Array_Ex;

import javafx.util.Pair;

import java.util.*;

public class C7_Student_Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> output = new LinkedHashMap<>();
        for (int i = 0; i < a; i++) {
            String uchemik = scanner.nextLine();
            double ocenka = Double.parseDouble(scanner.nextLine());
            output.putIfAbsent(uchemik,new ArrayList<>());
            output.get(uchemik).add(ocenka);
        }
        output.entrySet()
                .stream()
                .map(f -> {
                    double sr = f.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
                    return new Pair<>(f.getKey(),sr); })
                .filter(f -> f.getValue() >= 4.50)
                .sorted((f, f1) -> f1.getValue().compareTo(f.getValue()))
                .forEach(f -> System.out.println(String.format("%s -> %.2f",f.getKey(),f.getValue())));
    }
}
