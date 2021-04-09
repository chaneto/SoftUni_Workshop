package C10_Defining_Classes_Exercises.C7_Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Name> out = new HashMap<>();
        while (true){
            String[] p = scanner.nextLine().split(" ");
            if(p[0].equals("End")){break;}
            String name = p[0];
            String type = p[1];
            if(!out.containsKey(name)){
                out.put(name,new Name());
                out.get(name).setPockemons(new LinkedHashSet<>());
                out.get(name).setParents(new LinkedHashSet<>());
                out.get(name).setChildren(new LinkedHashSet<>());
                if(type.equals("pokemon")){
                    Pockemon pockemon = new Pockemon(p[2],p[3]);
                    out.get(name).getPockemons().add(pockemon);
                } if(type.equals("parents")){
                    Parents parents = new Parents(p[2],p[3]);
                    out.get(name).getParents().add(parents);
                }if(type.equals("children")){
                    Children children = new Children(p[2],p[3]);
                    out.get(name).getChildren().add(children);
                }if(type.equals("company")){
                    Company company = new Company(p[2],p[3],Double.parseDouble(p[4]));
                    out.get(name).setCompany(company);
                }if(type.equals("car")){
                    Car car = new Car(p[2],Integer.parseInt(p[3]));
                    out.get(name).setCar(car);
                }
            }else {
                if(type.equals("pokemon")){
                    Pockemon pockemon = new Pockemon(p[2],p[3]);
                    out.get(name).getPockemons().add(pockemon);
                } if(type.equals("parents")){
                    Parents parents = new Parents(p[2],p[3]);
                    out.get(name).getParents().add(parents);
                }if(type.equals("children")){
                    Children children = new Children(p[2],p[3]);
                    out.get(name).getChildren().add(children);
                }if(type.equals("company")){
                    Company company = new Company(p[2],p[3],Double.parseDouble(p[4]));
                    out.get(name).setCompany(company);
                }if(type.equals("car")){
                    Car car = new Car(p[2],Integer.parseInt(p[3]));
                    out.get(name).setCar(car);
                }
            }
        }
        String p = scanner.nextLine();
        System.out.println(p);
        System.out.print("Company:");
        try {
           System.out.printf("%n%s %s %.2f%n",out.get(p).getCompany().getCompanyname(),
           out.get(p).getCompany().getDepartment(),out.get(p).getCompany().getSalary());
        }catch (NullPointerException e){
            System.out.println();
        }
        System.out.print("Car:");
        try {
            System.out.printf("%n%s %d%n",out.get(p).getCar().getModel(),out.get(p).getCar().getSpeed());
        }catch (NullPointerException e){
            System.out.println();
        }


        System.out.println("Pokemon:");
        try {
        out.get(p).getPockemons().stream()
                .forEach(f -> System.out.printf("%s %s%n",f.getPokname(),f.getPoktype()));

        }catch (NullPointerException e){

        }
        System.out.println("Parents:");
        try {
        out.get(p).getParents().stream()
                .forEach(f -> System.out.printf("%s %s%n",f.getParentsname(),f.getParenbirth()));

        }catch (NullPointerException e){

        }
        System.out.println("Children:");
        try {
        out.get(p).getChildren().stream()
                .forEach(f -> System.out.printf("%s %s%n",f.getChildname(),f.getChilbirth()));

        }catch (NullPointerException e){

        }
    }
}
