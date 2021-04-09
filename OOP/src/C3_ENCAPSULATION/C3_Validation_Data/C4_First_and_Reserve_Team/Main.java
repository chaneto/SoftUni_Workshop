package C3_ENCAPSULATION.C3_Validation_Data.C4_First_and_Reserve_Team;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine ());
        Team team = new Team ("eagle");
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine ().split(" ");
            try {
            Person person = (new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
                team.addPlayer (person);
            }catch (IllegalArgumentException e){
                System.out.println (e.getMessage ());
            }
        }
        System.out.printf ("First team have %d players%n",team.getFirstTeam ().size ());
        System.out.printf ("First team have %d players",team.getReserveTeam ().size ());
    }
}
