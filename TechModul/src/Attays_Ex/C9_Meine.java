package ATECHMODUL.Attays_Ex;

import java.util.Scanner;

public class C9_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int result = 0;
        int sumwin = 0;
        int poziciqwin = Integer.MAX_VALUE;
        int broiposledovatelni = 1;
        int poziciq = 0;
        int sum = 0;
        int sumrecord = 0;
        int broiposledovatelniwin =0;
        String[] output = new String[a];
        String out = "";
        String outp = "";
        while (true){
            String p = scanner.nextLine();
            if(p.equals("Clone them!")){break;}
            String[] dna = p.split("!+");
            counter++;
            for (int i = 0; i < dna.length ; i++) {
                out += dna[i] + " ";
                if(dna[i].equals("1")) {
                    sum++;
                    for (int j = i+1; j < dna.length; j++) {
                        if (dna[i].equals("1") && dna[j].equals("1")) {
                            poziciq = i;
                            broiposledovatelni++;
                        } else {
                            break;
                        }
                    }

                }
            }

            if(broiposledovatelni > broiposledovatelniwin){
                broiposledovatelniwin = broiposledovatelni;
                result = counter;
                sumwin = sum;
                outp = out;
            }if(broiposledovatelni == broiposledovatelniwin && poziciq < poziciqwin ){
                sumwin = sum;
                result = counter;
                outp = out;

            }if(broiposledovatelni == broiposledovatelniwin && poziciqwin == poziciq && sum > sumrecord){
                sumwin = sum;
                result = counter;
                outp = out;
            } if(sum > sumrecord){
                sumrecord = sum;
            }if(poziciq < poziciqwin){
                poziciqwin = poziciq;
            }


            sum = 0;
            broiposledovatelni = 1;
            out = "";

        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",result,sumwin);
        System.out.println(outp);

    }
}
