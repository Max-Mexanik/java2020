package ru.maxmexanik.java2020.Task3;

public class Head {
    private String EyeColor;
    private String HairColor;
    private int EarSize;

    public Head(String EyeColor, String HairColor, int EarSize) {
        if (EarSize <= 0) {
            throw new IllegalStateException("Размер ушей не может быть меньше или равено нулю!");
        }
        this.EyeColor = EyeColor;
        this.HairColor = HairColor;
        this.EarSize = EarSize;
    }

    public String GetEyeColor() {
        return EyeColor;
    }

    public void SetEyeColor(String EyeColor) {
        this.EyeColor = EyeColor;
    }

    public String GetHairColor() {
        return HairColor;
    }

    public void SetHairColor(String HairColor) {
        this.HairColor = HairColor;
    }

    public int GetEarSize() {
        return EarSize;
    }

    public void SetEarSize(int EarSize) {
        this.EarSize = EarSize;
    }

    @Override
    public String toString() {
        return "Голова {" + "Цвет глаз: " + EyeColor + '\'' + ",Цвет волос: " + HairColor + '\'' + ", Размер ушей: " + EarSize + '}';
    }
}
