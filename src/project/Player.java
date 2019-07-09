/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package project;
import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author megha,2019
 */
public class Player 
{
    private String playerID; //the unique ID for this player
    private ArrayList<Card> deck = new ArrayList(26);
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name, ArrayList<Card> deck)
    {
        playerID= name;
        this.deck = deck;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    public void setDeck(ArrayList <Card> deck) {
        this.deck = deck;
    }
    
    public ArrayList<Card> getDeck() {
        return this.deck;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
    public abstract void play();
    removed play method as it is not needed in player class. 
    * Instead this will be in in the GameRunEnv class
    */
    
}
