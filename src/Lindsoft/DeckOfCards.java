package Lindsoft;

import java.util.LinkedList;

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
            this.deckofCards.add(new Card("Hearts", i+2));
            this.deckofCards.add(new Card("Diamonds", i+2));
            this.deckofCards.add(new Card("Clubs", i+2));
            this.deckofCards.add(new Card("Spades", i+2));
        }
    }

    public void shuffleDeck() {
        // draws a card at random position and puts the card on top of the deck (size of deck) times, this is done
        // (size of deck) times. Thats a total of (size of deck) * (size of deck) times.

        int randomSlotInDeck=0;
        int counter = 0;

        while(counter < this.deckofCards.size()-1) {

            for (int i = 0; i < this.deckofCards.size() - 1; i++) {

                Card shuffledCard = this.deckofCards.get(i);
                this.deckofCards.remove(i);
                this.deckofCards.add(shuffledCard);

            }
            counter++;
        }

    }

    public void printDeckOfCards() {
        // print all remaining cards of the deck
        for (int i=0; i < this.deckofCards.size(); i++) {
            System.out.println(this.deckofCards.get(i).getValueCard() + " of " + this.deckofCards.get(i).getSuite());
            System.out.println(i);
        }
    }

    public void burnTopCard() {
        // Burns the top card. Handy in games like Texas Hold Em.
        Card returnCard = this.deckofCards.get(0);
        this.deckofCards.remove(0);
        System.out.println("Card Burned");
    }

    public Card drawTopCard() {
        // Draws the top card from the deck, removes the card from the deck and return it.
        Card returnCard = this.deckofCards.get(0);
        this.deckofCards.remove(0);
        System.out.println("cardDrawn:" + returnCard.getValueCard() + " " + returnCard.getSuite());

        return returnCard;

    }

    public Card drawRandomCard() {
        // Draws a random card from the deck of cards, returns the card and removes the card from the deck.
        int cardDrawn = (int) (Math.random() * ((this.deckofCards.size()-1)));
        Card returnCard = this.deckofCards.get(cardDrawn);
        this.deckofCards.remove(cardDrawn);
        System.out.println("cardDrawn:" + returnCard.getValueCard() + " " + returnCard.getSuite());

        return returnCard;

    }
}
