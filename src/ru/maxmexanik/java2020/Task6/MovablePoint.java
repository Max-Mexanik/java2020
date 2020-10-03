package ru.maxmexanik.java2020.Task6;

public class MovablePoint implements Movable {
    private int X;
    private int Y;
    private final int Xspeed;
    private final int Yspeed;

    MovablePoint(int X, int Y, int Xspeed, int Yspeed){
        this.X = X;
        this.Y = Y;
        this.Xspeed = Xspeed;
        this.Yspeed = Yspeed;
    }

    @Override
    public void MoveUp() {
        this.Y += Yspeed;
    }

    @Override
    public void MoveDown() {
        this.Y -= Yspeed;
    }

    @Override
    public void MoveRight() {
        this.X -= Xspeed;
    }

    @Override
    public void MoveLeft() {
        this.X += Xspeed;
    }

    @Override
    public String toString() {
        return "Подвижная точка: {" + "Координата по оси Х: " + X + ", Координата по оси Y: " + Y + ", Скорость по оси Х: " + Xspeed + ", Скорость по оси Y" + Yspeed + '}';
    }
}
