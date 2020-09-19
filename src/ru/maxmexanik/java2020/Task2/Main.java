package ru.maxmexanik.java2020.Task2;



public class Main
{
    public static void main(String[] args) {
        Shape shape = new Shape(12, "Lol");
        int count = shape.getSidesCount();
        System.out.println(count);
        shape.setSidesCount(45);
        System.out.println(shape.getSidesCount());
        System.out.println(shape);
    }
}
