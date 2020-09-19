package ru.maxmexanik.java2020.Task2;

import java.lang.String;

public class Ball {
    public String Color;
    public int Weight;

    public String toString() {
        return this.Color + ", вес " + this.Weight;
    }

    public Ball(String Color, int Weight) {
        this.Color = Color;
        this.Weight = Weight;
        if (this.Weight > 567 & this.Weight < 650)
        {
            System.out.println(this.Color + " мяч. Это баскетбольный мяч.");
        }
        else
        if (this.Weight > 260 & this.Weight < 280)
        {
            System.out.println(this.Color + " мяч. Это волейбольный мяч.");
        }
        else
        if (this.Weight > 410 & this.Weight < 450)
        {
            System.out.println(this.Color + " мяч. Это футбольный мяч.");
        }
        else
        {
            System.out.println(this.Color + " мяч. Этот мячь не футбольный, волейбольный и не баскетбольный");
        }
    }

    public Ball(String Color){
        this.Color=Color;
        System.out.println("Цвет мяча: "+this.Color);
    }
}
