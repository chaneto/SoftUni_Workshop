package C9_Polymorphism.C2_Shapes;

public class Rectangle extends Shape{
   private Double height;
   private Double width;

    public Rectangle(Double perimeter, Double area) {
        super (perimeter, area);
    }
    @Override
    protected Double calculateArea(){
        return this.width * this.height;
    }@Override
    protected Double calculatePerimeter(){
        return 2 * (this.height + this.width);
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
