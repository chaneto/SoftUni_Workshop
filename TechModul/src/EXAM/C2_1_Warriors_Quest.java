package ATECHMODUL.EXAM;

import java.util.Scanner;

public class C2_1_Warriors_Quest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        while (true){
            String[] cmd = scanner.nextLine().split(" ");
            if(cmd[0].equals("For") && cmd[1].equals("Azeroth")){break;}
            String comand = cmd[0];
            if(comand.equals("GladiatorStance")){
                in = in.toUpperCase();
                System.out.println(in);
            }else if(comand.equals("DefensiveStance")){
                in = in.toLowerCase();
                System.out.println(in);
            }else if(comand.equals("Dispel")){
                int index = Integer.parseInt(cmd[1]);
                if(index >= 0 && index < in.length()){
                    String newchar = cmd[2];
                    String first  = in.substring(0,index);
                    String end = in.substring(index + 1);
                    in = first;
                    in+=newchar;
                    in+=end;
                    System.out.println("Success!");
                }else {
                    System.out.println("Dispel too weak.");
                }
            }
            else if(comand.equals("Target")){
                String old = cmd[2];
                if(cmd[1].equals("Change")){
                    String neu = cmd[3];
                   in = in.replaceAll(old,neu);
                    System.out.println(in);
                }else if(cmd[1].equals("Remove")){
                      in = in.replaceAll(old,"");
                        System.out.println(in);
                }else {
                    System.out.println("Command doesn't exist!");
                }
            }else {
                System.out.println("Command doesn't exist!");
            }
        }

    }
}
