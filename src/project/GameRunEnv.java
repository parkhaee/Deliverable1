/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author megha,2019
 */
public class GameRunEnv 
{
    // attribute moved to game setup private final String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    private boolean gameOn = true; //true as long as no one has lost
    private Player winner; //stores player object that wins
    private Player loser;
    private Card playerDrawnCard; // holding player card in current battle
    private Card compDrawnCard; //holding computer card in current battle
    
    // fed players and a shuffled deck of cards
    public GameRunEnv(ArrayList <Player> players, ArrayList <Card> deck)
    {
        // stores array list within class
        this.players = players;
        
        for (int i = 0; i < 26; i++) {
            this.players.get(0).getDeck().add(deck.get(i)); //fills player deck with half deck
            this.players.get(1).getDeck().add(deck.get(i+26)); //fills comps deck with other half
        }
        System.out.println(this.players.get(0).getDeck().size());
        

    }

    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public void drawCard(int cardNum) {
        // takes card from top of each deck
        // cardNum determines how far in to take card ie 2nd card from top
        playerDrawnCard = this.players.get(0).getDeck().get(cardNum);
        compDrawnCard = this.players.get(1).getDeck().get(cardNum);
    }
    
    public Player compare() {
        // checks the higher card and return player
        if (playerDrawnCard.value > compDrawnCard.value) {
            loser = players.get(1);
            return players.get(0);
        } else if (compDrawnCard.value > playerDrawnCard.value) {
            loser = players.get(0);
            return players.get(1);
        } else {
            return null;
        }
    }
    
    public void play() {
        while (gameOn) {
            drawCard(0); 
            
            System.out.printf("%s vs. %s\n", playerDrawnCard.rank, compDrawnCard.rank);
            //gives winner both cards (adds to end of list)
            if (compare() != null) { //compare() method returned the winning player
                compare().getDeck().add(compDrawnCard);
                compare().getDeck().add(playerDrawnCard);
                System.out.printf("%s wins this hand\n", compare().getPlayerID());
                System.out.printf("They won the %s of %s\n", compare().getDeck().get(0).rank, compare().getDeck().get(0).suit);
                //removes first card in deck of each player 
                this.players.get(0).getDeck().remove(0);
                this.players.get(1).getDeck().remove(0);
                
                System.out.println(this.players.get(0).getDeck().size()); //To be removed (for debugging)
                System.out.println(this.players.get(1).getDeck().size());
            } else {
                war(1); //if tie than calls war method
            }
            // if either deck is empty, end game
            if (this.players.get(0).getDeck().isEmpty()) {
                gameOn = false;
                winner = this.players.get(1);
                System.out.println("Computer won");
            } else if (this.players.get(1).getDeck().isEmpty()) {
                gameOn = false;
                winner = this.players.get(0);
                System.out.println("Player won");
            }
        } 
        
    }
    
    public void war(int _cardToDraw) {
        int cardToDraw = _cardToDraw; //how far into deck to draw card from
        
        System.out.println("WAR");
        drawCard(cardToDraw); // draws next card
        
        if (compare() != null) {
            compare().getDeck().add(compare().getDeck().get(0));
            compare().getDeck().remove(0);
            compare().getDeck().add(loser.getDeck().get(0));
            compare().getDeck().add(loser.getDeck().get(1));
            compare().getDeck().add(loser.getDeck().get(2));
            compare().getDeck().add(loser.getDeck().get(3));
            
            loser.getDeck().remove(0);
            loser.getDeck().remove(1);
            loser.getDeck().remove(2);
            loser.getDeck().remove(3);
            
            this.players.get(0).getDeck().remove(0);
            this.players.get(1).getDeck().remove(0);
            
            
            System.out.printf("%s wins this hand\n", compare().getPlayerID());
            System.out.printf("They won the %s of %s,\n", compare().getDeck().get(0).rank, compare().getDeck().get(0).suit);
            System.out.printf(" %s of %s,\n", compare().getDeck().get(1).rank, compare().getDeck().get(1).suit);
            System.out.printf("%s of %s,\n", compare().getDeck().get(2).rank, compare().getDeck().get(2).suit);
            System.out.printf("and the %s of %s.\n", compare().getDeck().get(0).rank, compare().getDeck().get(0).suit);
        } else {
            cardToDraw++;
            war(cardToDraw);
        }
    }
    
}
