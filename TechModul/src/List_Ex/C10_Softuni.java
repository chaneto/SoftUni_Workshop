package ATECHMODUL.List_Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class C10_Softuni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> in = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        M(in,scanner);
    }public static void M (List in,Scanner scanner){
        while (true) {
            String[] cmd = scanner.nextLine().split(":");
            if(cmd[0].equals("course start")){break;}
            if (cmd[0].equals("Add")) {
                int counter = 0;
                for (int i = 0; i < in.size(); i++) {
                    if (in.get(i).equals(cmd[1])) {
                        counter++;
                    }
                }
                if (counter == 0) {
                    in.add(cmd[1]);
                }
            }
            if (cmd[0].equals("Remove")) {
                int counter = 0;
                int index = 0;
                String ex = "";
                ex+=cmd[1];
                ex+="-Exercise";
                for (int i = 0; i < in.size(); i++) {
                    if (in.get(i).equals(cmd[1]) || in.get(i).equals(ex)) {
                        counter++;
                        index = i;
                    }
                }
                if (counter == 1) {
                    in.remove(index);
                }if(counter == 2){
                    in.remove(index );
                    in.remove(index - 1);
                }
            }
            if (cmd[0].equals("Exercise")) {
                int counter = 0;
                int counterex = 0;
                int index = 0;
                String ex = "";
                ex += cmd[1];
                ex += "-Exercise";
                for (int i = 0; i < in.size(); i++) {
                    if (in.get(i).equals(cmd[1])) {
                        counter++;
                        index = i;
                    }
                    if (in.get(i).equals(ex)) {
                        counterex++;
                    }
                }
                if (counter > 0 && counterex == 0) {
                    in.add(index + 1, ex);
                } else {
                    in.add(cmd[1]);
                    in.add(ex);
                }
            }if(cmd[0].equals("Swap")){
                int counter = 0;
                int counter1 = 0;
                int index = 0;
                int index1 = 0;
                String ex = "";
                String ex1 = "";
                ex+=cmd[1];ex+="-Exercise";
                ex1+=cmd[2];ex1+="-Exercise";
                for (int i = 0; i < in.size(); i++) {
                    if(cmd[1].equals(in.get(i)) || in.get(i).equals(ex)){
                        counter++;
                        index = i;
                    }if(cmd[2].equals(in.get(i)) || in.get(i).equals(ex1)){
                        counter1++;
                        index1 = i;
                    }
                }if(counter == 1 && counter1 == 1){
                    in.set(index,cmd[2]);
                    in.set(index1,cmd[1]);
                }if(counter == 2 && counter1 == 1){
                    in.set(index - 1,cmd[2]);
                    in.set(index1,cmd[1]);
                    in.remove(ex);
                    for (int i = 0; i < in.size(); i++) {
                        if(in.get(i).equals(cmd[1])){
                            in.add(i + 1,ex);
                        }
                    }

                }if(counter == 1 && counter1 == 2){
                    in.set(index,cmd[2]);
                    in.set(index1 - 1,cmd[1]);
                    in.remove(ex1);
                    for (int i = 0; i < in.size(); i++) {
                        if(in.get(i).equals(cmd[2])){
                            in.add(i + 1,ex1);
                        }
                    }
                }if(counter == 2 && counter1 == 2){
                    in.set(index - 1,cmd[2]);
                    in.set(index1 - 1,cmd[1]);
                    in.remove(ex);
                    in.remove(ex1);
                    for (int i = 0; i < in.size(); i++) {
                        if(in.get(i).equals(cmd[1])){
                            in.add(i + 1 ,ex);
                        } if(in.get(i).equals(cmd[2])){
                            in.add(i + 1 ,ex1);
                        }
                    }

                }
            }if(cmd[0].equals("Insert")){
                int counter = 0;
                int index = Integer.parseInt(cmd[2]);
                for (int i = 0; i < in.size(); i++) {
                    if(in.get(i).equals(cmd[1])){
                        counter++;
                    }
                }if(counter == 0){
                    in.add(index,cmd[1]);

                }
            }

        }for (int i = 0; i < in.size(); i++) {
            System.out.printf("%d.%s%n",i + 1,in.get(i));
        }

    }
}
