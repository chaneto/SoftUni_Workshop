package While_Cicle;

import java.util.Scanner;

public class CLASS7_Water {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ml = Integer.parseInt(scanner.nextLine());
        int broqch=0;
        int totalml = 0;
        while(totalml<ml){
            broqch++;
            String buton = scanner.nextLine();
            if(buton.equals("Easy")){totalml+=50;}
             else if(buton.equals("Medium")){totalml+=100;}
           else  if(buton.equals("Hard")){totalml+=200;}
            }
        if(totalml>ml){
            System.out.printf("%dml has been spilled.",totalml-ml);
        }else if(totalml==ml){
            System.out.printf("The dispenser has been tapped %d times.", broqch);}
        }
    }

