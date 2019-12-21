package com.company;

public class Sale implements Priceable {
    private int price;

    public Sale() {}
    public Sale(int price)
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
        return "Sale{" +
                "price=" + price +
                '}';
    }
}
