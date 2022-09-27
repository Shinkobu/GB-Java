package Seminar6.Shapes;

import Seminar6.Shapes.Shape;
import Seminar6.TypeShape;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        this.typeShape = TypeShape.CIRCLE;
    }

    @Override
    public void CalcArea() {
        area = Math.PI*radius*radius;
    }
}
