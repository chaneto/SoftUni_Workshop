package ATECHMODUL.Objects_and_Classes.uchenici2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        List<uchenici2> in = new ArrayList<>();
        while (true){
            if(p[0].equals("end")){break;}
            String name1 = p[0];
            String name2 = p[1];
            String age = p[2];
            String town = p[3];
            uchenici2 vr = new uchenici2(name1,name2,age,town);
            in.add(vr);
            p = scanner.nextLine().split(" ");
        }
        String cmd = scanner.nextLine();

        for (int i = 0; i < in.size() - 1; i++) {
            uchenici2 win = null;
            uchenici2 potok = in.get(i);
            String name1 = potok.getFirstName();
            String name2 = potok.getLastName();
            uchenici2 potok1 = in.get(i + 1);
            String name11 = potok1.getFirstName();
            String name22 = potok1.getLastName();
            if(cmd.equals(potok.getTown())){
            if(name1.equals(name11) && name2.equals(name22)){
                continue;
            }
            System.out.printf("%s %s is %s years old%n",potok.firstName,potok.lastName,potok.age);
        }

        }uchenici2 potok2 = in.get(in.size() - 1);
        if(cmd.equals(potok2.getTown())){
            System.out.printf("%s %s is %s years old%n",potok2.firstName,potok2.lastName,potok2.age);
        }
    }
}
