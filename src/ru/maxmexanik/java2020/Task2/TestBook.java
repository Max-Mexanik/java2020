package ru.maxmexanik.java2020.Task2;

public class TestBook
{
    public static void main(String[] args)
    {
        Book d1 = new Book("Fahrenheit 451",199 ,35 );
        Book d2 = new Book("Crime and Punishment",320 ,20 );
        Book d3 = new Book("Idiot",100 ,49 );
        Book d4 = new Book("War and Peace",370 ,90 );
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        d1.IntoDiscount();
        d2.IntoDiscount();
        d3.IntoDiscount();
        d4.IntoDiscount();
    }
}
