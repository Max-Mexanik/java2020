package ru.maxmexanik.java2020.Task4;

public class Author {
    private String Name;
    private String Email;
    private char Gender;

    Author(String Name, String Email, char Gender) {
        this.Name = Name;
        this.Email = Email;
        this.Gender = Gender;
    }

    public String GetName() {
        return Name;
    }

    public String GetEmail() {
        return Email;
    }

    public char GetGender() {
        return Gender;
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void SetEmail(String Email) {
        this.Email = Email;
    }

    public void SetGender(char Gender) {
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return "Автор: {" + "Имя: " + Name + '\'' + ", Электронная почта: " + Email + '\'' + ", Пол: " + Gender + '}';
    }
}
