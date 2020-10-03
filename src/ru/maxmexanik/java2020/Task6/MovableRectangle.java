package ru.maxmexanik.java2020.Task6;

public class MovableRectangle implements Movable {
    private final MovablePoint TopLeft;
    private final MovablePoint BottomRight;

    MovableRectangle(int X1, int Y1, int X2, int Y2, int Xspeed, int Yspeed){
        TopLeft = new MovablePoint(X1, Y1, Xspeed, Yspeed);
        BottomRight = new MovablePoint(X2, Y2, Xspeed, Yspeed);
    }

    @Override
    public void MoveUp() {
        TopLeft.MoveUp();
        BottomRight.MoveUp();
    }

    @Override
    public void MoveDown() {
        TopLeft.MoveDown();
        BottomRight.MoveDown();
    }

    @Override
    public void MoveRight() {
        TopLeft.MoveRight();
        BottomRight.MoveRight();
    }

    @Override
    public void MoveLeft() {
        TopLeft.MoveLeft();
        BottomRight.MoveLeft();
    }

    @Override
    public String toString() {
        return "Подвижный прямоугольник: {" + "Верхняя левая точка: " + TopLeft + ", Нижняя правая точка: " + BottomRight + '}';
    }
}
