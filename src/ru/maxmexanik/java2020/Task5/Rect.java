package ru.maxmexanik.java2020.Task5;

public class Rect extends Shape {
    protected double Width = 0.;
    protected double Length = 0.;

    Rect(){ }

    Rect(double Width, double Length){
        this.Width = Width;
        this.Length = Length;
    }

    Rect(double Width, double Length, String Color, boolean Filled){
        this.Width = Width;
        this.Length = Length;
        this.Color = Color;
        this.Filled = Filled;
    }

    public double GetWidth() {
        return Width;
    }

    public void SetWidth(double Width) {
        this.Width = Width;
    }

    public double GetLength() {
        return Length;
    }

    public void SetLength(double Length) {
        this.Length = Length;

    }

    @Override
    double GetArea() {
        return Width * Length;
    }

    @Override
    double GetPerimeter() {
        return 2 * (Width + Length);
    }

    @Override
    public String toString() {
        return "Прямогольник: {" + "Ширина: " + Width + ", Длинна:" + Length + ", Цвет: '" + Color + '\'' + ", Заполнение: " + Filled + '}';
    }
}
