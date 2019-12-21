package com.company;

import java.util.Random;

public class Card {
    private int rank;

    public Card(int i) {
        rank = i;
    }

    public int getRank() {
        return rank;
    }

    public boolean more(int x) {
        if ((rank > x) || ((rank == 0) && (x == 9)))
            return true;
        else
            return false;
    }
}
