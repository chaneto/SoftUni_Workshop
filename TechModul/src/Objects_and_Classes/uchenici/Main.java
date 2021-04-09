package ATECHMODUL.Objects_and_Classes.uchenici;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        List<uchenici> in = new ArrayList<>();
        while (true){
            if(p[0].equals("end")){break;}
            String firstName = p[0];
            String lastName = p[1];
            String age = p[2];
            String town = p[3];
            uchenici vr = new uchenici(firstName,lastName,age,town);
            in.add(vr);
            p = scanner.nextLine().split(" ");

        }
        String cmd = scanner.nextLine();
        for (int i = 0; i < in.size(); i++) {
            uchenici potok = in.get(i);
            if(cmd.equals(potok.getHomeTown())){
                System.out.printf("%s %s is %s years old%n",potok.getFirstName(),potok.getLsttName(),potok.getAge());
            }
        }
    }
}
