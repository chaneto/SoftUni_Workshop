package C10_Defining_Classes_Exercises.C4_Raw_Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        List<Car> output = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine().split(" ");
            String carmodel = input[0];
            Dvg engine = new Dvg(Integer.parseInt(input[1]),Integer.parseInt(input[2]));
            Cargo cargo = new Cargo(Integer.parseInt(input[3]),input[4]);
            double one = Double.parseDouble(input[5]);
            int one1 =   Integer.parseInt(input[6]);
            double two = Double.parseDouble(input[7]);
            int two1 =   Integer.parseInt(input[8]);
            double three = Double.parseDouble(input[9]);
            int three1 =   Integer.parseInt(input[10]);
            double four = Double.parseDouble(input[11]);
            int four1 =   Integer.parseInt(input[12]);
            Reifen reifen = new Reifen(one,one1,two,two1,three,three1,four,four1);
            Car car = new Car(carmodel, engine, cargo, reifen);
            output.add(car);
        }
        String p = scanner.nextLine();
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < output.size(); i++) {
            if(output.get(i).getCargo().getTupe().equals(p)){
                result.add(output.get(i));
            }
        }if(p.equals("fragile")){
            for (int i = 0; i < result.size(); i++) {
                    if(result.get(i).getReifen().getBar1() < 1 || result.get(i).getReifen().getBar2() < 1
                            || result.get(i).getReifen().getBar3() < 1 || result.get(i).getReifen().getBar4() < 1){
                        System.out.printf("%s%n",result.get(i).getCarmodel());
                    }
            }
        }if(p.equals("flamable")){
            for (int i = 0; i < result.size(); i++) {
                if(result.get(i).getDvg().getPower() > 250){
                    System.out.printf("%s%n",result.get(i).getCarmodel());
                }
            }
        }
    }
}
