package ru.maxmexanik.java2020.Task2;

public class Book
{
    public double DiscountMoney;
    public double PriceMinusDiscount;
    public String BookName;
    public double BookPrice;
    public double DiscountPercent;


    public Book (String BookName, int BookPrice, double DiscountPercent)
    {
        this.BookName = BookName;
        this.DiscountPercent = DiscountPercent;
        this.BookPrice = BookPrice;
        DiscountMoney = this.BookPrice / 100 * this.DiscountPercent;
        PriceMinusDiscount = this.BookPrice - this.DiscountMoney;
    }

    public String toString()
    {
        return this.BookName+", price "+this.BookPrice+", discount %"+this.DiscountPercent;
    }
    public void IntoDiscount()
    {
        System.out.println(this.BookName+", discount $"+DiscountMoney+", price minus the discount "+PriceMinusDiscount);
    }
}
