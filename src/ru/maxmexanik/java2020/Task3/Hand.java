package ru.maxmexanik.java2020.Task3;

public class Hand {
    private double Length;

    public Hand(double Length) {
        if (Length <= 0) {
            throw new IllegalStateException("Размер руки не может быть меньше или равен нулю!");
        }
        this.Length = Length;
    }

    public double GetLength() {
        return Length;
    }

    public void SetLength(double Length) {
        this.Length = Length;
    }

    @Override
    public String toString() {
        return "Рука {" + "Длинна: " + Length + '}';
    }
}
