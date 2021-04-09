package EXAM4;

import java.util.Scanner;

public class C2_Mountain_Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rekordSEK = Double.parseDouble(scanner.nextLine());
        double razstoqniemetri = Double.parseDouble(scanner.nextLine());
        double razstoqnieSEKzametar = Double.parseDouble(scanner.nextLine());
        double total = razstoqniemetri * razstoqnieSEKzametar;
        double zabavqna = Math.floor(razstoqniemetri/50)*30;
        double total1 = total + zabavqna;
        if(total1 < rekordSEK){
            System.out.printf(" Yes! The new record is %.2f seconds.",total1);
        }else{
            System.out.printf("No! He was %.2f seconds slower.",total1 - rekordSEK);
        }

    }
}
