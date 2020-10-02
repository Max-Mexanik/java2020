package ru.maxmexanik.java2020.Task3;

public class TestCircle {
    public static void main(String[] args) {
        Circle Circle = new Circle(10);
        System.out.println("Исходный радиус: " + Circle.GetRadius());

        Circle.SetRadius(25);
        System.out.println("Новый радиус: " + Circle.GetRadius());
    }
}
