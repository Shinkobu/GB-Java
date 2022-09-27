package Seminar6.Shapes;

import Seminar6.TypeShape;

public abstract class Shape {

    protected TypeShape typeShape;
    protected double area;

    public abstract void CalcArea();

    public TypeShape getTypeShape() {
        return typeShape;
    }

    public double getArea() {
        return area;
    }
}
