package C10_Defining_Classes_Exercises.C1_Opinion_Poll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<OpinionPoll> output = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            OpinionPoll opinionPoll = new OpinionPoll(name,age);
            if(opinionPoll.getAge() > 30){
            output.add(opinionPoll);
            }
        }output.stream()
                .sorted((s1,s2) -> s1.getName().compareTo(s2.getName()))
                .forEach(f -> System.out.printf("%s - %d%n",f.getName(),f.getAge()));
    }
}
