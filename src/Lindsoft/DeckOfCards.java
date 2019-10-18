package Lindsoft;

import java.util.LinkedList;
import java.util.Random;

public class DeckOfCards {

    private String nameOfDeck;
    private LinkedList<Card> deckofCards;

    public DeckOfCards(String nameOfDeck) {
        this.nameOfDeck = nameOfDeck;
        this.deckofCards = new LinkedList<Card>();
    }

    public void createDeckofCards() {
         // Creates a deck of cards, values 2-14, 11 = jacks, 12 = queens, 13 = kings, 14 = Ace.
        for(int i=0; i <= 12; i++) {
           deckofCards.add(new Card("Hearts", i+2));
           deckofCards.add(new Card("Diamonds", i+2));
           deckofCards.add(new Card("Clubs", i+2));
           deckofCards.add(new Card("Spades", i+2));
        }
    }

    public void shuffleDeck() {
        // draws a card at random position and puts the card on top of the deck (size of deck) times, this is done
        // (size of deck) times. Thats a total of (size of deck) * (size of deck) times.

        int randomSlotInDeck=0;
        int counter = 0;

        Random random = new Random();

        while (counter < deckofCards.size() - 1) {

            for (int i = 0; i < deckofCards.size(); i++) {
                int randomInteger = random.nextInt(52);
                Card shuffledCard = deckofCards.get(randomInteger);
                deckofCards.remove(randomInteger);
                deckofCards.add(shuffledCard);
            }


            counter++;
        }

    }

    public void printDeckOfCards() {
        // print all remaining cards of the deck
        for (int i=0; i <deckofCards.size(); i++) {
            System.out.println(this.deckofCards.get(i).getValueCard() + " of " +deckofCards.get(i).getSuite());
        }
    }

    public void burnTopCard() {
        // Burns the top card. Handy in games like Texas Hold Em.
        Card returnCard = deckofCards.get(0);
        deckofCards.remove(0);
        System.out.println("Card Burned");
    }

    public Card drawTopCard() {
        // Draws the top card from the deck, removes the card from the deck and return it.
        Card returnCard = deckofCards.get(0);
        deckofCards.remove(0);
        System.out.println("cardDrawn:" + returnCard.getValueCard() + " " + returnCard.getSuite());

        return returnCard;

    }

    public Card drawRandomCard() {
        // Draws a random card from the deck of cards, returns the card and removes the card from the deck.
        int cardDrawn = (int) (Math.random() * ((deckofCards.size()-1)));
        Card returnCard = deckofCards.get(cardDrawn);
        deckofCards.remove(cardDrawn);
        System.out.println("cardDrawn:" + returnCard.getValueCard() + " " + returnCard.getSuite());

        return returnCard;

    }
}
