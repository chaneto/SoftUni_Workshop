package ATECHMODUL.Objects_and_Classes_Ex.Opinion_Poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<Opinion_Poll> in = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");
            String name = p[0];
            Integer age = Integer.parseInt(p[1]);
            Opinion_Poll vr = new Opinion_Poll(name,age);
            in.add(vr);
        }
        in.stream()
                .filter(f -> f.getAge()>30)
                .sorted((f,f1)->f.getName().compareTo(f1.getName()))
                .forEach(f-> System.out.println(f.toString()));
    }
}
