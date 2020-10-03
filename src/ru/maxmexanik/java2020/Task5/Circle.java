package ru.maxmexanik.java2020.Task5;

public class Circle extends Shape{
    protected double Radius = 0.;
    protected static final double PI = 3.141592;

    Circle(){}

    Circle(double Radius){
        this.Radius = Radius;
    }

    Circle(double Radius, String Color, boolean Filled){
        this.Radius = Radius;
        this.Color = Color;
        this.Filled = Filled;
    }

    public void SetRadius(double Radius) {
        this.Radius = Radius;
    }

    public double GetRadius() {
        return Radius;
    }

    @Override
    double GetArea() {
        return PI * Math.sqrt(Radius);
    }

    @Override
    double GetPerimeter() {
        return 2 * PI * Radius;
    }

    @Override
    public String toString() {
        return "Круг: {" + "Радиус: " + Radius + ", Цвет: " + Color + '\'' + ", Заполнение: " + Filled + '}';
    }
}
