package ru.maxmexanik.java2020.Task5;

public class Square extends Rect {
    Square(){}

    Square(double Side){
        SetSide(Side);
    }

    @Override
    public void SetWidth(double Side){
        SetSide(Side);
    }

    @Override
    public void SetLength(double Side){
        SetSide(Side);
    }

    public void SetSide(double Side){
        this.Width = Side;
        this.Length = Side;
    }

    public double GetSide(){
        return Width;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
