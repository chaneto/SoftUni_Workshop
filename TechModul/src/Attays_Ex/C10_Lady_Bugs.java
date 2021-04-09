package ATECHMODUL.Attays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C10_Lady_Bugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] out = new int[a];
        for (int i = 0; i < in.length; i++) {
            int index = (in[i]);
            if(index >= 0 && index < a){
                out[index] = 1;
            }
        }while (true){
            String comand = scanner.nextLine();
            if(comand.equals("end")){break;}
            String[] cmd = comand.split(" ");
            int ind1 = Integer.parseInt(cmd[0]);
            int ind2 = Integer.parseInt(cmd[2]);
            if(ind1 < 0 || ind1 > a - 1 || out[ind1] == 0){
                continue;

            }out[ind1] = 0;
            if(cmd[1].equals("right")){
                ind1 += ind2;
                while (ind1 < a && out[ind1] == 1){
                    ind1 += ind2;
                }if(ind1 < a){
                    out[ind1] = 1;

                }

            }else {
                ind1 -= ind2;
                while (ind1 >= 0 && out[ind1] == 1){
                    ind1 -= ind2;
                }
                if(ind1 >= 0){
                    out[ind1] = 1;
                }
            }

        }
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");

        }
    }
}
