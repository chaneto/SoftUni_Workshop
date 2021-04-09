package While_Cicle_Ex;

import java.util.Scanner;

public class CLASS5_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double stotinki = a * 100;
        double resto = 0;
        double counter = 0;
        while(stotinki>0){
            if(stotinki>=200){
                counter++;
                stotinki -= 200;
            }else if(stotinki>=100){
                counter++;
                 stotinki -= 100;
            }else if(stotinki>=50){
                counter++;
                 stotinki -= 50;
            }else if(stotinki>=20){
                counter++;
                stotinki -= 20;
            }else if(stotinki>=10){
                counter++;
                stotinki -= 10;
            }else if(stotinki>=5){
                counter++;
                stotinki -= 5;
            }else if(stotinki>=2){
                counter++;
                stotinki -= 2;
            }else if(stotinki>=1){
                counter++;
                stotinki -= 1;
            }


        } System.out.printf("%.0f",counter);

    }
}
