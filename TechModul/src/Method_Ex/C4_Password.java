package ATECHMODUL.Method_Ex;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import javafx.scene.chart.StackedAreaChart;

import java.util.Scanner;

public class C4_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split("");
        M(in);
    }public static void M (String [] in){
        int counter  = 0;
        int counter1 = 0;
        for (int i = 0; i < in.length; i++) {
            char p = in[i].charAt(0);
            if((p < 97 || p > 122 )&& (p < 65 || p > 90 )&& (p < 48 || p > 57)){
                counter1++;
            }if(p > 47 && p < 58){
                counter++;
            }
        } if(in.length < 6 || in.length > 10){
            System.out.println("Password must be between 6 and 10 characters");
        }if(counter1 > 0){
            System.out.println("Password must consist only of letters and digits");
        }if(counter < 2){
            System.out.println("Password must have at least 2 digits");
        }else {
            System.out.println("Password is valid");
        }

    }
}
