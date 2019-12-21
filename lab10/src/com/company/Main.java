package com.company;

public class Main {

    public static void main(String[] args) {
	    GReturn<Integer> g = new GReturn<>();
        GReturn<String> h = new GReturn<>();
        g.add(100);
        g.add(0);
        g.add(-2);
        h.add("hghjkhkg");
        h.add("hjngfh");
        for (int i=0; i<h.size(); i++) {
            System.out.print(h.get(i)+" ");
        }
        System.out.println();
        for (int i=0; i<h.size(); i++) {
            System.out.print(g.get(i)+" ");
        }
    }
}

//3.	Реализовать метод, который возвращает любой элемент массива по индексу.