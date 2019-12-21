package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GReturn<E> {
    private ArrayList<E> array;

    public GReturn(int k) {
        array = new ArrayList<E>(k);
    }

    public GReturn() {
        array = new ArrayList<E>();
    }

    public void add(E e) {
        array.add(e);
    }

    public E get(int index) {
        return array.get(index);
    }

    public int size() {
        return array.size();
    }

}
