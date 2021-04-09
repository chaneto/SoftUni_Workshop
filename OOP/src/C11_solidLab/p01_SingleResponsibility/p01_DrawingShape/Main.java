package C11_solidLab.p01_SingleResponsibility.p01_DrawingShape;

import C11_solidLab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToDouble (Double::parseDouble).toArray ();
        double width = input[0];
        double heigth = input[1];
        Shape shape = new Rectangle (width, heigth);
        System.out.println("Hello World");
    }
}
