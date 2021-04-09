package cresla;

import cresla.entities.ManagerImpl;
import cresla.interfaces.Manager;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Manager manager = new ManagerImpl ();
        while (true){
            String[] p = scanner.nextLine ().split (" ");
            List<String> input = Arrays.stream (p).skip (1).collect(Collectors.toList());
            if(p[0].equals ("Exit")){
                System.out.println (manager.exitCommand (input));
                break;
            }if(p[0].equals ("Reactor")){
                System.out.println (manager.reactorCommand (input));
            }else if(p[0].equals ("Module")){
                System.out.println (manager.moduleCommand (input));
            }else if(p[0].equals ("Report")){
                System.out.println (manager.reportCommand (input));
            }
        }
    }
}
