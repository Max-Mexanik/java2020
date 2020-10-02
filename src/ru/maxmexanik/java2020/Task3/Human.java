package ru.maxmexanik.java2020.Task3;

public class Human {
    private String Name;
    private String Surname;
    private int Age;
    private Head Head;
    private Hand Hand;
    private Leg Leg;

    public Human(String Name, String Surname, int Age, Head Head, Hand Hand, Leg Leg) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.Head = Head;
        this.Hand = Hand;
        this.Leg = Leg;
    }

    public String GetName() {
        return Name;
    }

    public void SetName(String name) {
        this.Name = name;
    }

    public String GetSurname() {
        return Surname;
    }

    public void SetSurname(String surname) {
        this.Surname = surname;
    }

    public int GetAge() {
        return Age;
    }

    public void SetAge(int Age) {
        this.Age = Age;
    }

    public Head GetHead() {
        return Head;
    }

    public void SetHead(Head Head) {
        this.Head = Head;
    }

    public Hand GetHand() {
        return Hand;
    }

    public void SetHand(Hand Hand) {
        this.Hand = Hand;
    }

    public Leg GetLeg() {
        return Leg;
    }

    public void SetLeg(Leg Leg) {
        this.Leg = Leg;
    }

    @Override
    public String toString() {
        return "Человек: " + "Имя: " + Name + '\'' + ", Фамилия: " + Surname + '\'' + ", Возраст: " + Age + ", \nГолова: " + Head + ", \nРука: " + Hand + ", \nНога: " + Leg;
    }
}
