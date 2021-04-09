package C1_Abstraction.C2_Point_in_Rectangle;

public class Rectangle {
    private Point left;
    private Point right;

    public Rectangle(int leftx,int lefty, int rightx, int righty) {
        this.left = new Point (leftx, lefty);
        this.right = new Point (rightx, righty);
    }

    public boolean contains(Point point){
        if(point.getX () >= this.left.getX () && point.getX () <= right.getX ()){
            if(point.getY () >= this.left.getY () && point.getY () <= this.right.getY ()){
            return true;
            }
        }return false;
    }
}
