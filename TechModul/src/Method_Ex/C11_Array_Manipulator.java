package ATECHMODUL.Method_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_Array_Manipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        String [] p1 = new String[p.length];
        M(p,p1,scanner);
    }public static void M (String [] p,String [] p1,Scanner scanner){
        while (true){
            String[] cmd = scanner.nextLine().split(" ");
            if(cmd[0].equals("end")){
                break;}
            if(cmd[0].equals("exchange")){
                int index = Integer.parseInt(cmd[1]);
                if(index >= p.length || index < 0){
                    System.out.println("Invalid index");
                    continue;
                }
                for (int i = 0; i < p.length - index - 1; i++) {
                    p1[i] = p[i + index + 1];
                }
                for (int i = 0; i <= index; i++) {
                    p1[i + (p.length - index - 1)] = p[i];
                }
                for (int i = 0; i < p.length; i++) {
                    p[i] = p1[i];
                }
            }if(cmd[0].equals("max") && cmd[1].equals("even")){
                int out = 0;
                int index = 0;
                for (int i = 0; i < p.length; i++) {
                    int numer = Integer.parseInt(p[i]);
                    if(numer%2 == 0){
                        if(numer >= out){
                            out = numer;
                            index = i;
                        }
                    }
                }if(out == 0){
                    System.out.println("No matches");
                }else {
                    System.out.println(index);
                }
            }if(cmd[0].equals("max") && cmd[1].equals("odd")){
                int out = 0;
                int index = 0;
                for (int i = 0; i < p.length; i++) {
                    int numer = Integer.parseInt(p[i]);
                    if(numer%2 != 0){
                        if(numer >= out){
                            out = numer;
                            index = i;
                        }
                    }
                }if(out == 0){
                    System.out.println("No matches");
                }else {
                    System.out.println(index);
                }
            }if(cmd[0].equals("min") && cmd[1].equals("even")){
                int out = Integer.MAX_VALUE;
                int index = 0;
                for (int i = 0; i < p.length; i++) {
                    int numer = Integer.parseInt(p[i]);
                    if(numer%2 ==0){
                        if(numer <= out){
                            out = numer;
                            index = i;
                        }
                    }
                }if(out == Integer.MAX_VALUE){
                    System.out.println("No matches");
                }else {
                    System.out.println(index);
                }
            }if(cmd[0].equals("min") && cmd[1].equals("odd")){
                int out = Integer.MAX_VALUE;
                int index = 0;
                for (int i = 0; i < p.length; i++) {
                    int numer = Integer.parseInt(p[i]);
                    if(numer%2 !=0){
                        if(numer <= out){
                            out = numer;
                            index = i;
                        }
                    }
                }if(out == Integer.MAX_VALUE){
                    System.out.println("No matches");
                }else {
                    System.out.println(index);
                }
            }if(cmd[0].equals("first") && cmd[2].equals("even")){
                int chislo = Integer.parseInt(cmd[1]);
                if(chislo > p.length){
                    System.out.println("Invalid count");
                    continue;}
                int counter = 0;
                List<String> out = new ArrayList<>();
                for (int i = 0; i < p.length; i++) {
                    int index = Integer.parseInt(p[i]);
                    if(index%2 == 0){
                        counter++;
                        out.add(p[i]);
                        if (counter == chislo) {
                            break;
                        }
                    }
                }if(counter > 0){
                    System.out.print("[");
                    for (int i = 0; i < out.size() - 1; i++) {
                        System.out.print(out.get(i) + "," + " ");
                    }
                    System.out.println(out.get(out.size() - 1) + "]");
                }else {
                    System.out.println("[]");
                }

            }if(cmd[0].equals("first") && cmd[2].equals("odd")){
                int chislo = Integer.parseInt(cmd[1]);
                if(chislo > p.length){
                    System.out.println("Invalid count");
                    continue;}
                int counter = 0;
                List<String> out = new ArrayList<>();
                for (int i = 0; i < p.length; i++) {
                    int index = Integer.parseInt(p[i]);
                    if(index%2 != 0){
                        counter++;
                        out.add(p[i]);
                        if (counter == chislo) {
                            break;
                        }

                    }
                }if(counter > 0){
                    System.out.print("[");
                    for (int i = 0; i < out.size() - 1; i++) {
                        System.out.print(out.get(i) + "," + " ");
                    }
                    System.out.println(out.get(out.size() - 1) + "]");
                }else {
                    System.out.println("[]");
                }

            }

            if(cmd[0].equals("last") && cmd[2].equals("even")){
                int chislo = Integer.parseInt(cmd[1]);
                if(chislo > p.length){
                    System.out.println("Invalid count");
                    continue;}
                int counter = 0;
                List<String> out = new ArrayList<>();
                for (int i = p.length - 1; i >= 0 ; i--) {
                    int index = Integer.parseInt(p[i]);
                    if(index%2 == 0){
                        counter++;
                        out.add(p[i]);
                        if(counter == chislo){break;}
                    }
                }if(out.size() > 0){
                    System.out.print("[");
                    for (int i = out.size() - 1; i >= 1 ; i--) {
                        System.out.print(out.get(i) + "," + " ");
                    }
                    System.out.println(out.get(0) + "]");
                }else {
                    System.out.println("[]");
                }
            }if(cmd[0].equals("last") && cmd[2].equals("odd")){
                int chislo = Integer.parseInt(cmd[1]);
                if(chislo > p.length){
                    System.out.println("Invalid count");
                    continue;}
                int counter = 0;
                List<String> out = new ArrayList<>();
                for (int i = p.length - 1; i >= 0 ; i--) {
                    int index = Integer.parseInt(p[i]);
                    if(index%2 != 0){
                        counter++;
                        out.add(p[i]);
                        if(counter == chislo){break;}
                    }
                }if(out.size() > 0){
                    System.out.print("[");
                    for (int i = out.size() - 1; i >= 1 ; i--) {
                        System.out.print(out.get(i) + "," + " ");
                    }
                    System.out.println(out.get(0) + "]");
                }else {
                    System.out.println("[]");
                }
            }

        }
        System.out.print("[");
        for (int i = 0; i < p.length - 1; i++) {
            System.out.print(p[i] + "," + " ");
        }
        System.out.println(p[p.length - 1] + "]");
    }
}