package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ex a = new Ex();
        Demo5 b = new Demo5();
        Demo6 c = new Demo6();
        Demo7 d = new Demo7();
        Demo8 e = new Demo8();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Выберите пункт (1-8): ");
        while (i == 0) {
            if (sc.hasNextInt()) {
                i = sc.nextInt();
            }
        }
        switch (i) {
            case 1:
                a.exceptionDemo1();
                break;
            case 2:
                a.exceptionDemo2();
                break;
            case 3:
                a.exceptionDemo3();
                break;
            case 4:
                a.exceptionDemo4();
                break;
            case 5:
                b.printMessage5(null);
                b.printMessage5(" aaa");
                break;
            case 6:
                c.getKey();
                break;
            case 7:
                d.getKey();
                break;
            case 8:
                e.getKey();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
