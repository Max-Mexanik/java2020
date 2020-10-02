package ru.maxmexanik.java2020.Task3;

public class Circle {
    private double Radius;

    public Circle(double Radius) {
        this.Radius = Radius;
    }

    public double GetRadius() {
        return Radius;
    }

    public void SetRadius(double Radius) {
        if (Radius < 0)
        {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        this.Radius = Radius;
    }
}
