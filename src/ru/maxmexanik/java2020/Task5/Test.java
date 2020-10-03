package ru.maxmexanik.java2020.Task5;

public class Test {
    public static void main(String[] args){
        Shape shape1 = new Circle(2.28, "Розовый", false);
        System.out.println(shape1.toString());
        System.out.println(shape1.GetArea());
        System.out.println(shape1.GetPerimeter());
        System.out.println(shape1.GetColor());
        System.out.println(shape1.IsFilled());

        Circle circle1 = (Circle)shape1;
        System.out.println(circle1);
        System.out.println(circle1.GetArea());
        System.out.println(circle1.GetPerimeter());
        System.out.println(circle1.GetColor());
        System.out.println(circle1.IsFilled());
        System.out.println(circle1.GetRadius());

        Shape shape3 = new Rect(6.2, 7.3, "Зеленый", true);
        System.out.println(shape3);
        System.out.println(shape3.GetArea());
        System.out.println(shape3.GetPerimeter());
        System.out.println(shape3.GetColor());

        Rect rectangle1 = (Rect)shape3;
        System.out.println(rectangle1);
        System.out.println(rectangle1.GetArea());
        System.out.println(rectangle1.GetColor());
        System.out.println(rectangle1.GetLength());

        Shape shape4 = new Square(2.8);
        System.out.println(shape4);
        System.out.println(shape4.GetArea());
        System.out.println(shape4.GetColor());

        Rect rectangle2 = (Rect)shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.GetArea());
        System.out.println(rectangle2.GetColor());
        System.out.println(rectangle2.GetLength());

        Square square1 = (Square)rectangle2;
        System.out.println(square1);
        System.out.println(square1.GetArea());
        System.out.println(square1.GetColor());
        System.out.println(square1.GetSide());
        System.out.println(square1.GetLength());
    }
}
