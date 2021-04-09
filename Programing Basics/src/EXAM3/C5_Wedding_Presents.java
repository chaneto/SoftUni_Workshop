package EXAM3;

import java.util.Scanner;

public class C5_Wedding_Presents {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double broigosti = Double.parseDouble(scanner.nextLine());
            double sumgift = Double.parseDouble(scanner.nextLine());
            double pari = 0;
            double el = 0;
            double vaucher = 0;
            double oder = 0;
            double totalpari = 0;
            double totalel = 0;
            double totalvaucher = 0;
            double totaloder = 0;
            double total = 0;
            for (int i = 0; i < sumgift; i++) {
                String p = scanner.nextLine();
                if(p.equals("A")){
                    pari++;
                totalpari = pari / sumgift * 100;
                }else if (p.equals("B")){
                    el++;
                    totalel = el / sumgift * 100;
                }else if (p.equals("V")){
                    vaucher++;
                    totalvaucher = vaucher / sumgift * 100;
                }else if (p.equals("G")){
                    oder++;
                    totaloder = oder / sumgift * 100;
                }


            }total = sumgift / broigosti * 100;
            System.out.printf("%.2f%%%n",totalpari);
            System.out.printf("%.2f%%%n",totalel);
            System.out.printf("%.2f%%%n",totalvaucher);
            System.out.printf("%.2f%%%n",totaloder);
            System.out.printf("%.2f%%%n",total);
        }
    }

