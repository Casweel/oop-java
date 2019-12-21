package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Выберите пункт (1-3): ");
        Scanner sc = new Scanner(System.in);
        while (i == 0) {
            if (sc.hasNextInt()) {
                i = sc.nextInt();
            }
        }
        switch (i) {
            case 1:
                ArrayList a = new ArrayList(5);
                a.add(1);
                a.add(100);
                a.add('h');
                a.add("go");
                System.out.println(a);
                System.out.println(a.get(2));
                System.out.println(a.indexOf(100));
                a.remove(0);
                a.set(1, 'j');
                System.out.println(a.subList(1, a.size()));
                System.out.println(a);
                break;
            case 2:
                LinkedList<Integer> b = new LinkedList<Integer>();
                b.add(1);
                b.add(100);
                System.out.println(b);
                System.out.println(b.get(1));
                System.out.println(b.indexOf(100));
                b.remove(0);
                b.set(0, 200);
                System.out.println(b);
                break;
            case 3:
                MyList c = new MyList();
                c.add(5);
                c.add("dasfsad");
                c.add('j');
                c.add(678);
                c.print();
                c.del(2);
                System.out.println();
                System.out.println(c.get(1));
                c.replace(0, 100);
                c.print();
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
}

//протестировать работу коллекции arraylist
//Протестировать работу коллекции LinkedList.
//Создать свою коллекцию, такую же как и ArrayList.