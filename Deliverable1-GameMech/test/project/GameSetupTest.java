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
public class GameSetupTest
{

   public GameSetupTest ()
   {
   }

   /**
    * Test of fill method, of class GameSetup.
    */
   @Test
   public void testFillCardSuitGood ()
   {
      System.out.println("testFill CardSuit Good");
      String pass = "CLUB";
      boolean expResult = true;
      boolean result = GameSetup.fill(pass); //can't figure this out!
      assertEquals(expResult, result);

   }

   @Test
   public void testFillCardSuitBad ()
   {
      System.out.println("testFill CardSuit Bad");
      String pass = "CLUBS";
      boolean expResult = false;
      boolean result = GameSetup.fill(pass); //can't figure this out!
      assertEquals(expResult, result);

   }

   @Test
   public void testFillCardRankGood ()
   {
      System.out.println("testFill CardRank Good");
      String pass = "ACE";
      boolean expResult = true;
      boolean result = GameSetup.fill(pass); //can't figure this out!
      assertEquals(expResult, result);

   }

   @Test
   public void testFillCardRankBad ()
   {
      System.out.println("testFill CardRank Bad");
      String pass = "ELEVEN";
      boolean expResult = false;
      boolean result = GameSetup.fill(pass); //can't figure this out!
      assertEquals(expResult, result);

   }

}
