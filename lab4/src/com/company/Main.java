package com.company;

public class Main {

    public static void main(String[] args) {
        Sale sale = new Sale(100);
        Hedgehog h = new Hedgehog(800);
        System.out.println(sale.toString());
        System.out.println(h.toString());
    }
}
