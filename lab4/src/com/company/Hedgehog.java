package com.company;

public class Hedgehog implements Priceable {
    private int price;

    public Hedgehog() {}
    public Hedgehog(int price)
    {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Hedgehog{" +
                "price=" + price +
                '}';
    }
}
