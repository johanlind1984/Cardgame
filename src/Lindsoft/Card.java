package Lindsoft;

public class Card {

    public String suite;
    public int valueCard;

    public Card(String suite, int valueCard) {
        this.suite = suite;
        this.valueCard = valueCard;
    }

    public String getSuite() {
        return suite;
    }

    public int getValueCard() {
        return valueCard;
    }
}
