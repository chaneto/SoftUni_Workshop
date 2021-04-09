package C9_Polymorphism.C2_Shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double perimeter, Double area) {
        super (perimeter, area);
    }
    @Override
    protected Double calculateArea(){
        return Math.PI * this.radius * this.radius;
    }
    @Override
    protected Double calculatePerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public final Double getRadius() {
        return radius;
    }
}
