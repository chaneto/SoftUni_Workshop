package C11_solidLab.p03_LiskovSubstitution.p01_Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Rectangle rectangle = new Rectangle ();
        rectangle.setHeight (3);
        rectangle.setWidth (2);
        Square square = new Square ();
        square.setHeight (8);
        square.setWidth (2);
        Circle circle = new Circle ();
        circle.setRadius (5.1);
        System.out.println (rectangle.getArea ());
        System.out.println (square.getArea ());
        System.out.println (circle.getArea ());
    }
}
