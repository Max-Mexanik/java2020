package ru.maxmexanik.java2020.Task6;

public class MovableCircle implements Movable {
    private final int Radius;
    private final MovablePoint Center;

    MovableCircle(int X, int Y, int Xspeed, int Yspeed, int Radius) {
        Center = new MovablePoint(X, Y, Xspeed, Yspeed);
        this.Radius = Radius;
    }

    @Override
    public void MoveUp() {
        Center.MoveUp();
    }

    @Override
    public void MoveDown() {
        Center.MoveDown();
    }

    @Override
    public void MoveRight() {
        Center.MoveRight();
    }

    @Override
    public void MoveLeft() {
        Center.MoveLeft();
    }

    @Override
    public String toString() {
        return "Подвижный круг: {" + "Радиус: " + Radius + ", Центр: " + Center + '}';
    }
}
