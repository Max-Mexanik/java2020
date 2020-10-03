package ru.maxmexanik.java2020.Task5;

public class Square extends Rect {
    Square(){}

    Square(double Side){
        SetSide(Side);
    }

    @Override
    public void SetWidth(double side){
        SetSide(side);
    }

    @Override
    public void SetLength(double side){
        SetSide(side);
    }

    public void SetSide(double side){
        this.Width = side;
        this.Length = side;
    }

    public double GetSide(){
        return Width;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
