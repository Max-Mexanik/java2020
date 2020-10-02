package ru.maxmexanik.java2020.Task2;

public class TestDog {
    public static void main(String[] args) {
        Dog D1 = new Dog("Bobik",1);
        Dog D2 = new Dog("Lelik",5);
        Dog D3 = new Dog("Snejok");
        System.out.println(D1);
        System.out.println(D2);
        System.out.println(D3);
        D1.IntoHumanAge();
        D2.IntoHumanAge();
        D3.IntoHumanAge();
    }
}
