package While_Cicle;

import java.util.Scanner;

public class CLASS5_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String steps= scanner.nextLine();
        int allSteps=0;
        int krachki=0;


        while (allSteps<10000){
            if (!steps.equals("Going home")){
                krachki=Integer.parseInt(steps);
                allSteps+=krachki;

                if (allSteps>=10000){
                    System.out.println("Goal reached! Good job!");
                    break;
                }
                steps=scanner.nextLine();
            }else {
                steps=scanner.nextLine();
                krachki=Integer.parseInt(steps);
                allSteps+=krachki;

                if (allSteps<10000){
                    System.out.printf("%d more steps to reach goal.",10000-allSteps);
                }else{
                    System.out.println("Goal reached! Good job!");
                }
                break;
            }
        }


    }
}


