package C11_solidLab.p02_OpenClosedPrinciple.p02_DrawingShape;

public class Main {
    public static void main(String[] args) {
        DrawingManagerImpl drawingManager = new DrawingManagerImpl ();
        drawingManager.draw (new Circle ());
        drawingManager.draw (new Rectangle ());
        drawingManager.draw (new Triangle ());
    }
}
