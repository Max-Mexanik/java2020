package ru.maxmexanik.java2020.Task5;

public abstract class Shape {
    protected String Color;
    protected boolean Filled;

    Shape() { }

    Shape(String Color, boolean Filled){
        this.Color = Color;
        this.Filled = Filled;
    }

    public String GetColor() {
        return Color;
    }

    public void SetColor(String Color) {
        this.Color = Color;
    }

    public boolean IsFilled() {
        return Filled;
    }

    public void SetFilled(boolean Filled) {
        this.Filled = Filled;
    }

    abstract double GetArea();

    abstract double GetPerimeter();

    @Override
    public String toString() {
        return "Фигура: {" + "Цвет: " + Color + '\'' + ", Заполнение: " + Filled + '}';
    }
}
