package ATECHMODUL.Attays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C9_Kamino_Factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daljina = Integer.parseInt(scanner.nextLine());

        int broiredove = 0;
        int bestbroiredove = 0;
        int bestCountOnes = 0;
        int broiposledovatelni = 0;
        int parvochislo = 0;
        int bestIndex = Integer.MAX_VALUE;
        int bestposledovatelnost = 0;
        String[] bestArray = new String[daljina];

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Clone them!")) {
                break;
            }
            broiredove++;
            int countOnes = 0;
            String[] DNA = input.split("!+");
            for (int i = 0; i < DNA.length; i++) {
                int tekushtaposledovatelnost = 0;
                int tekustFirstIndex = -1;
                int tekustbroi = 0;

                if (DNA[i].equals("1")) {
                    tekustbroi++;
                }


                for (int j = i + 1; j < DNA.length; j++) {
                    if (DNA[i].equals("1") && DNA[j].equals("1") && tekustFirstIndex == -1) {
                        tekustFirstIndex = i;
                    }
                    if (DNA[i].equals("1") && DNA[j].equals("1")) {
                        tekushtaposledovatelnost++;

                    } else {
                        break;
                    }
                }
                if (tekushtaposledovatelnost > broiposledovatelni) {
                    parvochislo = tekustFirstIndex;
                    broiposledovatelni = tekushtaposledovatelnost;
                    bestbroiredove = broiredove;

                }
                if (tekushtaposledovatelnost == broiposledovatelni && parvochislo > tekustFirstIndex){
                    parvochislo = tekustFirstIndex;
                    broiposledovatelni = tekushtaposledovatelnost;
                    bestbroiredove = broiredove;
                }
                countOnes += tekustbroi;
            }


            if (broiposledovatelni > bestposledovatelnost) {
                bestIndex = parvochislo;
                bestposledovatelnost = broiposledovatelni;
                bestArray = Arrays.copyOf(DNA, DNA.length);
                bestCountOnes = countOnes;



            }
            if (broiposledovatelni == bestposledovatelnost && parvochislo < bestIndex) {
                bestIndex = parvochislo;
                bestArray = Arrays.copyOf(DNA, DNA.length);
                bestCountOnes = countOnes;

            }
            if (broiposledovatelni == bestposledovatelnost && parvochislo == bestIndex && countOnes > bestCountOnes) {
                bestbroiredove = broiredove;
                bestIndex = parvochislo;
                bestArray = Arrays.copyOf(DNA, DNA.length);
                bestCountOnes = countOnes;

            }
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestbroiredove, bestCountOnes));
        System.out.println(String.join(" ", bestArray));

    }

}
