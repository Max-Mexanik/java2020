package ru.maxmexanik.java2020.Task6;

public class Test {
    public static void main(String[] args){
        Movable Movable1 = new MovableCircle(2, 1, 3 ,3,3);
        Movable Movable2 = new MovableRectangle(3, 1, 6, 0, 1, 2);
        Movable1.MoveDown();
        Movable2.MoveUp();
        System.out.println(Movable1);
        System.out.println(Movable2);
    }
}
