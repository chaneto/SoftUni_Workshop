package C11_solidLab.p02_OpenClosedPrinciple.p02_DrawingShape;

import C11_solidLab.p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println ("Circle");
    }
}
