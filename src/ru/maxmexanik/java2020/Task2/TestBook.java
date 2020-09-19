package ru.maxmexanik.java2020.Task2;

public class TestBook
{
    public static void main(String[] args)
    {
        Book d1 = new Book("Fahrenheit 451",199 ,35 );
        Book d2 = new Book("Harry Potter",320 ,20 );
        Book d3 = new Book("Harry Potter",110 ,50 );
        Book d4 = new Book("Harry Potter",370 ,90 );
        System.out.println(d1);
        d1.IntoDiscount();
    }
}
