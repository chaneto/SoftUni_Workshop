package EXAM1;

import java.util.Scanner;

public class C3_Game_Sattistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        if(min == 0){
            System.out.println("Match has just began! " );
        } if(min < 45 ){
            System.out.println("First half time." );
            if(min >=1 && min<=10){
                System.out.println(name + " missed a penalty.");
                if(min%2==0){
                    System.out.println(name + " was injured after the penalty.");
                }
            }else if (min > 10 && min <= 35){
                System.out.println(name + " received yellow card." );
                if(!(min %2 == 0)){
                    System.out.println(name + " got another yellow card.");
                }
            }else if(min > 35 && min < 45 ){
                System.out.println(name + " SCORED A GOAL !!!"  );
            }
        }if(min >= 45){
            System.out.println("Second half time." );
            if(min > 45 && min <=55) {
                System.out.println(name + " got a freekick.");
                if(min %2 == 0){
                    System.out.println(name + " missed the freekick." );
                }
            }else if (min > 55 && min <= 80){
                System.out.println(name + " missed a shot from corner.");
                if(!(min %2 == 0)){
                    System.out.println( name + " has been changed with another player.");
                }
            }else if(min > 80 && min <=90){
                System.out.println(name + " SCORED A GOAL FROM PENALTY !!!" );
            }
        }
    }
}
