package ru.maxmexanik.java2020.Task3;

public class Leg {
    private int FootSize;

    public Leg(int FootSize) {
        if (FootSize <= 0) {
            throw new IllegalStateException("Размер ноги не модет быть меньше или равен нулю!");
        }
        this.FootSize = FootSize;
    }

    public int GetFootSize() {
        return FootSize;
    }

    public void SetFootSize(int FootSize) {
        this.FootSize = FootSize;
    }

    @Override
    public String toString() {
        return "Нога {" + "Размер ноги: " + FootSize + '}';
    }
}
