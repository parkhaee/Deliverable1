/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hollands251
 */
public class PlayingCard extends Card {
    
    //this.players.get(0).setDeck(p1Deck);
    
    public PlayingCard(CardRank rank, CardSuit suit, int value) {
        super(rank, suit, value);
    }
    
    public CardRank getRank() {
        return this.rank;
    }

    public CardSuit getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return String.format("%s of %ss", this.rank, suit);
    }
    
    
}
