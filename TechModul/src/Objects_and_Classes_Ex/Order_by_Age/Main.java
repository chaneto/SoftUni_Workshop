package ATECHMODUL.Objects_and_Classes_Ex.Order_by_Age;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Order> in = new ArrayList<>();
        while (true){
            String[] p = scanner.nextLine().split(" ");
            if(p[0].equals("End")){break; }
            String name = p[0];
            Integer numer = Integer.parseInt(p[1]);
            Integer age = Integer.parseInt(p[2]);
            Order vr = new Order(name,numer,age);
            in.add(vr);
        }in
                .stream()
                .sorted((f,f1)->f.getAge().compareTo(f1.getAge()))
                .forEach(f-> System.out.println(f.toString()));
    }
}
