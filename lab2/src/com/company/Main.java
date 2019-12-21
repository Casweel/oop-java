package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите параметры: ");
        BookTest book = new BookTest("Gogol", "Viy", 1899, 2000, "Drofa");
        System.out.println("Старый год издания: " + book.getYear());
        book.setYear(1000);
        System.out.println("Новый год издания: " + book.getYear());

    }
}