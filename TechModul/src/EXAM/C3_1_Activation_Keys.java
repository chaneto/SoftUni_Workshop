package ATECHMODUL.EXAM;

import java.util.Arrays;
import java.util.Scanner;

public class C3_1_Activation_Keys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        while (true){
            String[] cmd = scanner.nextLine().split(">>>");
            if(cmd[0].equals("Generate")){break;}
            String command = cmd[0];
            if(command.equals("Contains")){
                String text = cmd[1];
                if(in.contains(text)){
                    System.out.printf("%s contains %s",in,text);
                }else {
                    System.out.println("Substring not found!");
                }
            }if(command.equals("Flip")){
                String command1 = cmd[1];
                int startindex = Integer.parseInt(cmd[2]);
                int endindex = Integer.parseInt(cmd[3]);
                if(command1.equals("Upper")){
                    String start = in.substring(0,startindex);
                    String end = in.substring(endindex);
                    String upper = in.substring(startindex,endindex);
                    upper = upper.toUpperCase();
                    in = start;
                    in += upper;
                    in += end;
                    System.out.println(in);
                }if(command1.equals("Lower")){
                    String start = in.substring(0,startindex);
                    String end = in.substring(endindex);
                    String lower = in.substring(startindex,endindex);
                    lower = lower.toLowerCase();
                    in = start;
                    in += lower;
                    in += end;
                    System.out.println(in);
                }
            }if(command.equals("Slice")){
                int start = Integer.parseInt(cmd[1]);
                int end = Integer.parseInt(cmd[2]);
                String one = in.substring(0,start);
                String two = in.substring(end);
                in = one;
                in += two;
                System.out.println(in);
            }
        }
        System.out.printf("Your activation key is: %s",in);
    }
}
