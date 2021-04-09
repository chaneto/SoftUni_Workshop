package ATECHMODUL.Attays_Ex;

import java.util.Scanner;

public class C3_Zig_Zag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String [] b = new String[a];
        String [] c = new String[a];
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");
            if(i%2 == 0){
                b[i] = p[0];
                c[i] = p[1];
            }else {
                b[i] = p[1];
                c[i] = p[0];
            }
        }
        System.out.println(String.join(" ",b));
        System.out.println(String.join(" ",c));

    }
}
