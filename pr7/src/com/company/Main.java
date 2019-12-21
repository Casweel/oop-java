package com.company;

public class Main {

    public static void main(String[] args) {
        boolean botva = false;
        Deck firstDeck = new Deck(new Card(1),new Card(8),new Card(4),new Card(6),new Card(7));
        Deck secondDeck = new Deck(new Card(0),new Card(9),new Card(2),new Card(4),new Card(3));

     /*   for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {

                firstDeck.addCard(new Card(i));
                System.out.println(firstDeck.getCard().getRank());
            } else {

                secondDeck.addCard(new Card(i));
                System.out.println(secondDeck.getCard().getRank());
            }
        }*/

        int i = 0;
        while (!botva) {
            i++;
            if (i == 106) {
                System.out.println("botva");
                break;
            }

            if (firstDeck.getCard().more(secondDeck.getCard().getRank()))
                firstDeck.addCard(secondDeck.removeCard());

            else secondDeck.addCard(firstDeck.removeCard());

            if (firstDeck.isEmpty())
            {
                System.out.println("first " + i);
                break;
            }
            else if (secondDeck.isEmpty())
            {
                System.out.println("second " + i);
                break;
            }
        }
    }
}
