package ru.maxmexanik.java2020.Task2;

public class Shape {
    private int NumOfSides;
    private String ShapeName;

    public Shape(int NumOfSides, String ShapeName) {
        this.NumOfSides = NumOfSides;
        this.ShapeName = ShapeName;
    }

    public void setSidesCount(int NumOfSides) {
        this.NumOfSides = NumOfSides;
    }

    public int getSidesCount() {
        return NumOfSides;
    }

    @Override
    public String toString() {
        return "Shape{name='" + ShapeName + '\'' + '}';
    }

    public void printShapeInfo() {
        System.out.println(NumOfSides);
        System.out.println(ShapeName);
    }
}
