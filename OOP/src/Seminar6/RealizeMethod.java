package Seminar6;

import Seminar6.Shapes.Circle;
import Seminar6.Shapes.Rectangle;
import Seminar6.Shapes.Shape;
import Seminar6.Shapes.Square;

import java.util.Scanner;
import java.util.Stack;

public class RealizeMethod implements UserInterface{

    Stack<Shape> shapes = new Stack<>();

    @Override
    public void receiveTypeShape() {
        System.out.println("Выберите тип фигуры: \n1 - круг, \n2 - прямоугольник, \n3 - квадрат");
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        switch (number){
            case 1:
                System.out.println("Введите радиус");
                Double r = sc.nextDouble();

                shapes.add(new Circle(r));
                break;
            case 2:
                System.out.println("Введите длину одной стороны");
                Double s1 = sc.nextDouble();
                System.out.println("Введите длину другой стороны");
                Double s2 = sc.nextDouble();

                shapes.add(new Rectangle(s1,s2));
                break;

            case 3:
                System.out.println("Введите длину одной стороны");
                Double s3 = sc.nextDouble();

                shapes.add(new Square(s3));

            default:
                break;
        }

        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(4.0,6.0);
        Shape s3 = new Square(5.0);

        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);

        for (Shape item: shapes) {
            item.CalcArea();
            System.out.println(item.getArea());
        }
    }

    @Override
    public void dataShape() {

    }
}
