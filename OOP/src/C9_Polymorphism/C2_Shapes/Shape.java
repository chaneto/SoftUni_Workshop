package C9_Polymorphism.C2_Shapes;

public class Shape {
   private Double perimeter;
   private Double area;

    public Shape(Double perimeter, Double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    protected Double calculatePerimeter(){
        return null;
    }
    protected Double calculateArea(){
        return null;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }
}
