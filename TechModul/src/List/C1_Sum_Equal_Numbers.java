package ATECHMODUL.List;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1_Sum_Equal_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        List<Double> in = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            double a = Double.parseDouble(p[i]);
            in.add(a);
        }
        for (int i = 0; i < in.size() - 1; i++) {
            if(in.get(i) .equals(in.get(i + 1)) ){
                double sum = in.get(i) * 2;
                in.remove(i);
                in.remove(i);
                in.add(i,sum);
                i = - 1;

            }
            }
        for (Double num : in) {
            DecimalFormat format = new DecimalFormat("#.#");
            System.out.print(format.format(num) + " ");
        }
    }
}
