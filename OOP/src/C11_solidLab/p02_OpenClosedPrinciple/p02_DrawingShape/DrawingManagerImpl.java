package C11_solidLab.p02_OpenClosedPrinciple.p02_DrawingShape;


import C11_solidLab.p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.DrawingManager;
import C11_solidLab.p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {

    @Override
    public void draw(Shape shape) {
        shape.draw ();
    }
}
