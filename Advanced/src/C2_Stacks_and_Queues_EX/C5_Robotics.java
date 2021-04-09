package C2_Stacks_and_Queues_EX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C5_Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(";");
        Deque<String> frei = new ArrayDeque<>();
        Deque<String> busy = new ArrayDeque<>();
        for (int i = 0; i < p.length; i++) {
            frei.offer(p[i]);
        }
        String[] hour = scanner.nextLine().split(":");
        int hh = Integer.parseInt(hour[0]);
        int min = Integer.parseInt(hour[1]);
        int sec = Integer.parseInt(hour[2]);
        String detail = scanner.nextLine();
        while (!detail.equals("End")){
            if(sec > 60){
                min++;
                sec = 0;
            }if(min > 60){
                hh++;
                min = 0;
            }if(hh > 24){
                hh = 0;
            }
            sec++;
            if(!frei.isEmpty()){
                String[] robot = frei.peek().split("-");
                String namerobot = robot[0];
                int time = Integer.parseInt(robot[1]);
                busy.offer(frei.poll());
                System.out.printf("%s - %s [%d:%d:%d]%n",namerobot,detail,hh,min,sec);

            }
            detail = scanner.nextLine();
        }
    }
}
