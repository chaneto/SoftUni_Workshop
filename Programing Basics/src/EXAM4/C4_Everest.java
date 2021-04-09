package EXAM4;

import java.util.Scanner;

public class C4_Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String p = scanner.nextLine();
        int sum = 5364;
        int counter = 1;
        int counter1 = 0;
        while (!(p.equals("END"))){
            if(p.equals("Yes")){
                counter++;
            }if(counter > 5){break;
            }
            int m = Integer.parseInt(scanner.nextLine());
            sum += m;
            if(sum >= 8848){break;}
            p = scanner.nextLine();
        }
        if(sum >= 8848){
            System.out.printf("Goal reached for %d days!",counter);
        }else if(sum < 8848){
            System.out.printf("Failed!%n");

            System.out.println(sum);
        }
    }
}
