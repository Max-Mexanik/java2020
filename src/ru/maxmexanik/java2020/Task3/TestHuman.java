package ru.maxmexanik.java2020.Task3;

public class TestHuman {
    public static void main(String[] args) {
        Human Human = new Human("Сегрей", "Коваленко", 20, new Head("Голубые", "Белые", 1), new Hand(35), new Leg(40));
        System.out.println("1) " + Human + "\n");
        Human.SetHead(new Head("Карие", "Каштановые", 3));
        Human.SetSurname("Снегирёв");
        Human.SetLeg(new Leg(43));
        System.out.println("2) " + Human + "\n");
        Human.GetHead().SetHairColor("Синие");
        System.out.println("3) " + Human);
    }
}
