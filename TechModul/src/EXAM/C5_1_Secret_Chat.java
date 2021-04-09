package ATECHMODUL.EXAM;

import java.util.Scanner;

public class C5_1_Secret_Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        while (true){
            String[] cmd = scanner.nextLine().split(":\\|:");
            String command = cmd[0];
            if(command.equals("Reveal")){
                break;
            }
            if(command.equals("InsertSpace")){
                int index = Integer.parseInt(cmd[1]);
                String start = in.substring(0,index);
                String end = in.substring(index);
                in = start;
                in += " ";
                in += end;
                System.out.println(in);
            }if(command.equals("Reverse")){
                String text = cmd[1];
                String reverse = "";
                if(in.contains(text)){
                    for (int i = text.length() - 1; i >= 0; i--) {
                        reverse += text.charAt(i);
                    }int one = in.indexOf(text);
                    String part1  = in.substring(0,one);
                    String part2 = in.substring(one + text.length());
                    in = part1;
                    in += part2;
                    in += reverse;
                    System.out.println(in);
                }else {
                    System.out.println("error");
                }

            }if(command.equals("ChangeAll")){
                String old = cmd[1];
                String neu = cmd[2];
                in = in.replaceAll(old,neu);
                System.out.println(in);
            }
        }
        System.out.printf("You have a new text message: %s",in);
    }
}
