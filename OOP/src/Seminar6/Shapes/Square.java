package Seminar6.Shapes;

import Seminar6.Shapes.Rectangle;
import Seminar6.TypeShape;

public class Square extends Rectangle {

    public Square(double sideOne) {
        super(sideOne, sideOne);
        this.typeShape = TypeShape.SQUARE;
    }
}
