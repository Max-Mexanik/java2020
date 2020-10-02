package ru.maxmexanik.java2020.Task2;

public class Dog
{
    public String DogName;
    public int DogAge;


    public String getDogName()
    {
        return DogName;
    }

    public void setDogName(String dogName)
    {
        DogName = dogName;
    }

    public int getDogAge() {
        return DogAge;
    }

    public void setDogAge(int dogAge)
    {
        DogAge = dogAge;
    }


    public Dog(String DogName, int DogAge)
    {
        this.DogName = DogName;
        this.DogAge = DogAge;
    }

    public Dog(int Age)
    {
        this.DogAge = Age;
    }

    public Dog(String Name)
    {
        this.DogName = Name;
    }


    public void IntoHumanAge()
    {
        System.out.println((DogName+"'s age in human years is " + DogAge * 7 + "years"));
    }
}
