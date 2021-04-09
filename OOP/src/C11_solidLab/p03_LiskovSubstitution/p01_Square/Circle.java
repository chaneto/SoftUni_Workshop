package C11_solidLab.p03_LiskovSubstitution.p01_Square;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * 3.14;
    }
}
