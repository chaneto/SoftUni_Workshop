package C4_Multidimensional_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C5_Matrix_Shuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rol = a[0];
        int col = a[1];
        String[][] out = new String[rol][col];
        for (int i = 0; i < rol; i++) {
            String[] p = scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                out[i][j] = p[j];
            }
        }while (true){
            String[] p = scanner.nextLine().split(" ");
            String cmd = p[0];
            if(cmd.equals("END")){
                break;
            }

            if(cmd.equals("swap") && p.length == 5){
                int einz = Integer.parseInt(p[1]);
                int zwei = Integer.parseInt(p[2]);
                int drei = Integer.parseInt(p[3]);
                int vier = Integer.parseInt(p[4]);
                if((einz >= 0 && einz < rol) &&  (drei >= 0 && drei < rol)
                        && (zwei >= 0 && zwei < col) && (vier >= 0 && vier < col)){
                    String one = out[einz][zwei];
                    String two = out[drei][vier];
                    out[einz][zwei] = two;
                    out[drei][vier] = one;
                    for (int i = 0; i < rol; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print(out[i][j] + " ");
                        }
                        System.out.println();
                    }
                }else {
                    System.out.println("Invalid input!");
                }

            }else {
                System.out.println("Invalid input!");
            }
        }
    }
}
