package com.company;

public abstract class Dog {
    protected String color;
    protected String gender;
    protected int weight;

    public Dog() {
    }

    public Dog(String a, String n, int y) {
        this.color = a;
        this.gender = n;
        this.weight = y;
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
