package com.company;

import java.util.Scanner;

public class Main {

    public static int factorial(int a) {

        if (a < 0) {
            System.out.println("Ошибка");
            return 0;
        }

        int f = 1;

        for (int i = a; i > 1; i--) {

            f = f * i;

        }

        return f;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        if (sc.hasNextInt()) {

            int i = sc.nextInt();

            System.out.println(factorial(i));

        }
    }
}
