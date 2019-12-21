package com.company;

public class Alabai extends Dog {
    private int height;

    public Alabai() {
    }

    public Alabai(String color, String gender, int weight, int height) {
        super(color, gender, weight);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Alabai{" +
                super.toString() + ", " +
                "height=" + height + "} ";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
