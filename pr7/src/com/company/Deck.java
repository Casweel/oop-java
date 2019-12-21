package com.company;

import java.util.Stack;

public class Deck {
    private Stack cards;

    public Deck() {
        cards = new Stack();
    }

    public Deck(Card c1, Card c2, Card c3, Card c4, Card c5) {
        cards = new Stack();
        cards.push(c1);
        cards.push(c2);
        cards.push(c3);
        cards.push(c4);
        cards.push(c5);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public void addCard(Card card) {
        cards.push(card);
    }

    public Card getCard() {
        return (Card) cards.peek();
    }

    public Card removeCard() {
        return (Card) cards.pop();
    }

    public String printDeck() {
        return "Deck: " + cards;
    }
}
