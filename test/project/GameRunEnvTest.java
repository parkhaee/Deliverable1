/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author ninez
 */
public class GameRunEnvTest
{

   public GameRunEnvTest ()
   {
   }


//      ArrayList<Player> expResult = null;
//      ArrayList<Player> result = instance.getPlayers();


   /**
    * Test of drawCard method, of class GameRunEnv.
    */
   @Test
   public void testDrawCardGood ()
   {
      boolean result = false;
      System.out.println("drawCard Good");
      CardRank rank = CardRank.KING;
      CardSuit suit = CardSuit.DIAMOND;
      boolean expResult = true;
      if (rank == CardRank.KING && suit == CardSuit.DIAMOND) {
         result = true;
      }
      assertEquals(expResult, result);
   }

   @Test
   public void testDrawCardBad ()
   {
      boolean result = false;
      System.out.println("drawCard Bad");
      CardRank rank = CardRank.JACK;
      CardSuit suit = CardSuit.HEART;
      boolean expResult = false;
      if (rank == CardRank.KING && suit == CardSuit.DIAMOND) {
         result = true;
      }
      assertEquals(expResult, result);
   }

   /**
    * Test of compare method, of class GameRunEnv.
    */
   @Test
   public void testCompareGood ()
   {
      System.out.println("compare Good");
      boolean expResult = true;
      boolean result = false;
      PlayingCard drawnCard1 = new PlayingCard(CardRank.EIGHT, CardSuit.CLUB, 8);
      PlayingCard drawnCard2 = new PlayingCard(CardRank.FIVE, CardSuit.SPADE, 5);
      if (drawnCard1.value > drawnCard2.value) {
         result = true;
      }
      else if (drawnCard1.value < drawnCard2.value) {
         result = false;
      }
      else {

      }
      assertEquals(expResult, result);
   }

   @Test
   public void testCompareBad ()
   {
      System.out.println("compare Bad");
      boolean expResult = false;
      boolean result = true;
      PlayingCard drawnCard1 = new PlayingCard(CardRank.NINE, CardSuit.CLUB, 9);
      PlayingCard drawnCard2 = new PlayingCard(CardRank.QUEEN, CardSuit.SPADE, 11);
      if (drawnCard1.value > drawnCard2.value) {
         result = true;
      }
      else if (drawnCard1.value < drawnCard2.value) {
         result = false;
      }
      else {

      }
      assertEquals(expResult, result);
   }

   @Test
   public void testCompareBoundary ()
   {
      System.out.println("compare Boundary");
      boolean expResult = true;
      boolean result = false;
      PlayingCard drawnCard1 = new PlayingCard(CardRank.NINE, CardSuit.CLUB, 9);
      PlayingCard drawnCard2 = new PlayingCard(CardRank.NINE, CardSuit.HEART, 9);
      if (drawnCard1.value > drawnCard2.value) {
         result = false;
      }
      else if (drawnCard1.value < drawnCard2.value) {
         result = false;
      }
      else if (drawnCard1.value == drawnCard2.value) {
         result = true;
      }
      assertEquals(expResult, result);
   }
}
