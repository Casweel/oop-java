package com.company;

public class Main {
    //static int counter = 0;

    public Main() {
    }

    static int sum(int from) {
        int to = 0;
        if (from / 10 == 0)
            return to;
        to = from % 10 + sum(from / 10);
        return to;
    }

    static String from1ToN(int n) {
        String s = "";
        if (n < 1)
            return s;
        s = from1ToN(n - 1) + n;
        return s;
    }

    static int roll(int n) {
        int r = 0;
        if (n / 10 == 0)
            return r;
        r = roll(n / 10)+ (n % 10) ;
        return r*10;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(12345));
        System.out.println("from1ToN: " + from1ToN(16));
        System.out.println("Roll: " + roll(123));
    }
}
