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
 *
 * @author megha,2019
 */
public abstract class Game
{
   private final String gameName;//the title of the game
   private ArrayList<Player> players;// the players of the game

   public Game (String givenName)
   {
      gameName = givenName;
      players = new ArrayList();
   }

   /**
    * @return the gameName
    */
   public String getGameName ()
   {
      return gameName;
   }

   /**
    * @return the players of this game
    */
   public ArrayList<Player> getPlayers ()
   {
      return players;
   }

   /**
    * @param players the players of this game
    */
   public void setPlayers (ArrayList<Player> players)
   {
      this.players = players;
   }

   /**
    * Play the game. This might be one method or many method calls depending
    * on your game.
    */
   public abstract void play ();

   /**
    * When the game is over, use this method to declare and display a winning
    * player.
    */
   public abstract void declareWinner ();



}//end class

//
//package project1_deliverable;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Project1_Deliverable
//{
/**
 * @param args the command line arguments
 */
//   public static void main (String[] args)
//   {
//      Scanner in = new Scanner(System.in);
//
//      System.out.println("Enter your name:");
//      String name = in.next();
//
//      System.out.println(name + " the computer will pick a card for you...");
//
//      Random rnd = new Random();


//
//   }
//}
