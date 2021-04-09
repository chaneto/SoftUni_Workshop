package EXAM1;

import java.util.Scanner;

public class C4_Best_Player {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int golove = 0;
        String igrach = "";
        while (true){
            String p = scanner.nextLine();
            if(p.equals("END")){break;}
            int a = Integer.parseInt(scanner.nextLine());
            if(a > golove){
                golove = a;
                igrach = p;
            }if(golove >= 10){break;}
        }
        System.out.printf("%s is the best player!%n",igrach);
        if(golove >= 3 ){
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n",golove);
        }else{
            System.out.printf("He has scored %d goals.",golove);}
    }
}
