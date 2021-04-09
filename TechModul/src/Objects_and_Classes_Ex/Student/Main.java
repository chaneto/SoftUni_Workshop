package ATECHMODUL.Objects_and_Classes_Ex.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<Student> in = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");
            String firstname = p[0];
            String lastname = p[1];
            double ocenka = Double.parseDouble(p[2]);
            Student vr = new Student(firstname,lastname,ocenka);
            in.add(vr);
        }in
                .stream()
                .sorted((f,f1)->f1.getOcenka().compareTo(f.getOcenka()))
                .forEach(f-> System.out.println(f.toString()));
    }
}
