package For_While_Cicle;

import java.util.Scanner;

public class CLASS9_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        double waschmaschine = Double.parseDouble(scanner.nextLine());
        double pricetoys = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        double sumtoys = 0;
        double s = 0;
        double countereven = 0;
        double counterodd = 0;
        double total = 0;
        for (int i = 1; i <= age ; i++) {
            if(i % 2 == 0){
                sum += 10;
                countereven ++;
                s += sum;

            }else {
                counterodd++;
            }
        }
        sumtoys = pricetoys * counterodd;
        total = (s - countereven) + sumtoys;
        if(waschmaschine <= total){
            System.out.printf("Yes! %.2f",total - waschmaschine);
        }else{
            System.out.printf("No! %.2f",waschmaschine - total);
        }
    }
}
