package EXAM;

import java.util.Scanner;

public class C1_1_Nikuldens_Charity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        while (true){
            String[] cmd = scanner.nextLine().split(" ");
            if(cmd[0].equals("Finish")){break;}
            if(cmd[0].equals("Replace")){
                in = in.replace(cmd[1],cmd[2]);
                System.out.println(in);
            }if(cmd[0].equals("Cut")){
                int startindex = Integer.parseInt(cmd[1]);
                int endindex = Integer.parseInt(cmd[2]);
                if(startindex >= 0 && endindex <= in.length() - 1){
                    String part1 = in.substring(0,startindex);
                    String part2 = in.substring(endindex + 1);
                    in = part1;
                    in += part2;
                    System.out.println(in);
                }else {
                    System.out.println("Invalid indexes!");
                }
            }if(cmd[0].equals("Make")){
                if(cmd[1].equals("Upper")){
                    in = in.toUpperCase();
                    System.out.println(in);
                }if(cmd[1].equals("Lower")){
                    in = in.toLowerCase();
                    System.out.println(in);
                }
            }if(cmd[0].equals("Check")){
                String word = cmd[1];
                boolean check = false;
                if(in.contains(word)){
                    check = true;
                }if(check){
                    System.out.printf("Message contains %s%n",word);
                }else {
                    System.out.printf("Message doesn't contain %s%n",word);
                }
            }if(cmd[0].equals("Sum")){
                int startindex = Integer.parseInt(cmd[1]);
                int endindex = Integer.parseInt(cmd[2]);
                int sum = 0;
                if(startindex >= 0 && endindex <= in.length() - 1){
                    for (int i = startindex; i <= endindex; i++) {
                        sum+=in.charAt(i);
                    }System.out.println(sum);
                }else {
                    System.out.println("Invalid indexes!");
                }

            }
        }

    }
}
