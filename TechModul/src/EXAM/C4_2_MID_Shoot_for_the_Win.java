package ATECHMODUL.EXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C4_2_MID_Shoot_for_the_Win {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 0;
        while (true){
            String p = scanner.nextLine();
            if(p.equals("End")){
                break;
            }int posiciq = Integer.parseInt(p);
            if(posiciq < in.length && in[posiciq] != -1 ){
                counter++;
                int num = in[posiciq];
                for (int i = 0; i < in.length; i++) {
                    if(in[i] == -1){
                       continue;
                    }int neu = in[i];
                    if(neu > num){
                        neu = neu - num;
                    }else {
                        neu = neu + num;
                    }in[posiciq] = -1;
                    in[i] = neu;

                }
            }
        }
        System.out.printf("Shot targets: %d -> ",counter);
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i] + " ");
        }
    }
}