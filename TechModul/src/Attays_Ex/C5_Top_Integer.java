package ATECHMODUL.Attays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C5_Top_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e ->Integer.parseInt(e)).toArray();
        String out = "";
        int counter = 0;
        for (int i = 0; i < in.length - 1; i++) {
            for (int j = i + 1; j < in.length ; j++) {
                if(in[i] <= in[j] ){
                    counter++;
                }
            }if(counter == 0){
                out+=in[i];
                out+=" ";
            }else {counter = 0;}
        }out+=in[in.length - 1];
        System.out.println(out);

    }
}
