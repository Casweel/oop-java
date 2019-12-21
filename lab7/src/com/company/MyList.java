package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyList {
    private Object[] list;

    public MyList() {
        list = new Object[0];
    }

    public MyList(int a) {
        list = new Object[a];
    }

    public int size() {
        return list.length;
    }

    public void add(Object x) {
        Object[] list1 = new Object[list.length + 1];
        for (int i = 0; i < list.length; i++)
            list1[i] = list[i];
        list1[list.length] = x;
        list = new Object[list.length + 1];
        for (int i = 0; i < list1.length; i++)
            list[i] = list1[i];
    }

    public void del(int x) {
        Object[] list1 = new Object[list.length - 1];
        for (int i = 0; i < x; i++)
            list1[i] = list[i];
        for (int i = x + 1; i < list.length; i++)
            list1[i-1] = list[i];

        list = new Object[list.length - 1];
        for (int i = 0; i < list1.length; i++)
            list[i] = list1[i];
    }

    public void replace(int x, Object a) {
        list[x] = a;
    }

    public Object get(int x) {
        return list[x];
    }

    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
