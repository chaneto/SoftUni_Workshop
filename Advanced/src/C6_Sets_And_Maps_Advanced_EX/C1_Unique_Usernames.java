package C6_Sets_And_Maps_Advanced_EX;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class C1_Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < number; i++) {
            String p = scanner.nextLine();
            set.add(p);
        }set.stream().forEach(f -> System.out.println(f));
    }
}
