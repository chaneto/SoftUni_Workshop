package C10_Defining_Classes_Exercises.C2_Company_Roster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        Map<String,List<Rabotnici>> out = new LinkedHashMap<>();
        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String otdel = input[3];
            Rabotnici rabotnici;
            if(input.length == 4){
                rabotnici = new Rabotnici(name,salary,position, otdel);
            }else if(input.length == 5){
                String imeil = input[4];
                if(imeil.contains("@")){
                    rabotnici = new Rabotnici(name,salary,position, otdel,imeil);
                }else {
                    int age = Integer.parseInt(imeil);
                    rabotnici = new Rabotnici(name,salary,position, otdel,age);
                }
            }else {
                String imeil = input[4];
                int age = Integer.parseInt(input[5]);
                rabotnici = new Rabotnici(name,salary,position, otdel,imeil,age);
            }if(!out.containsKey(otdel)){
                out.put(otdel,new ArrayList<>());
                out.get(otdel).add(rabotnici);
            }else {
                out.get(otdel).add(rabotnici);
            }
        }String win = "";
        double max = 0;
        for(Map.Entry<String,List<Rabotnici>> t : out.entrySet()){
            double vr = 0;
            int counter = 0;
            for(Rabotnici p : t.getValue()){
                counter++;
                vr += p.getSalary();
            }if(vr / counter > max){
                max = vr / counter;
                win = t.getKey();
            }
        }
        System.out.printf("Highest Average Salary: %s%n",win);
        out.get(win).stream()
                .sorted(Comparator.comparingDouble(Rabotnici::getSalary).reversed())
                .forEach(f -> System.out.printf("%s %.2f %s %d%n",f.getName(),f.getSalary(),f.getImeil(),f.getAge()));
    }
}
