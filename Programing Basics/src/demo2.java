import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double la = Double.parseDouble(scanner.nextLine());
        double corabcm3 = l * w * h;
        double staqcm =  la + 0.40;
        double staqcm3 = 4 * staqcm;
        double total=Math.floor(corabcm3 / staqcm3);
        if(total >= 3 && total <= 10){
        System.out.printf("The spacecraft holds %.0f astronauts.",total );
        }else if(total < 3){
            System.out.println("The spacecraft is too small.");
        }else if(total > 10){
            System.out.println("The spacecraft is too big.");
        }
    }
}