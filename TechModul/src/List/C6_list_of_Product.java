package ATECHMODUL.List;

import java.util.*;

public class C6_list_of_Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<String> out = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String p = scanner.nextLine();
            out.add(p);
        }
        Collections.sort(out);
        for (int i = 0; i < out.size(); i++) {
            System.out.printf("%d.%s%n",i + 1,out.get(i));
        }
    }
}

