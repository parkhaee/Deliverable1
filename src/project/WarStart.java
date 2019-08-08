/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.ArrayList;

/**
 *
 * @author hollands251
 */
public class WarStart
{
   public static void main (String[] args)
   {
      System.out.println("war... war never changes");
      Player player = new Player("player", new ArrayList<PlayingCard>(52));
      Player comp = new Player("comp", new ArrayList<PlayingCard>(52));
      GameSetup game = new GameSetup(player, comp);
      game.runGame();
   }
}
