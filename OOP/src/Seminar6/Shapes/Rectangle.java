package Seminar6.Shapes;

import Seminar6.TypeShape;

public class Rectangle extends Shape {

    private double sideOne;
    private double sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.typeShape = TypeShape.RECTANGLE;
    }

    @Override
    public void CalcArea() {
        area =  sideOne*sideTwo;
    }
}
