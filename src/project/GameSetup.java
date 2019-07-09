/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hollands251
 * 
 */
public class GameSetup {
    private ArrayList <Card> deck = new ArrayList(52);
    private ArrayList <Player> players = new ArrayList(2);
    GameRunEnv environment;
    
    
    GameSetup(Player player, Player comp) {
        this.players.add(player);
        this.players.add(comp);
        fill();
        shuffle();
        environment = new GameRunEnv(players, deck);
    }
    
    public void fill() {
    CardSuit suit;
    CardRank rank;
    
        for (int idx = 0; idx < 4; idx++) {
            if (idx == 0) {
                suit = CardSuit.CLUB;
            } else if (idx == 1) {
                suit = CardSuit.DIAMOND;
            } else if (idx == 2) {
                suit = CardSuit.HEART;
            } else {
                suit = CardSuit.SPADE;
            }
            
            
            for (int i = 2; i < 15; i++) {
                switch(i) {
                    case(2):
                        rank = CardRank.TWO;
                        break;
                    case(3):
                        rank = CardRank.THREE;
                        break;
                    case(4):
                        rank = CardRank.FOUR;
                        break;
                    case(5):
                        rank = CardRank.FIVE;
                        break;
                    case(6):
                        rank = CardRank.SIX;
                        break;
                    case(7):
                        rank = CardRank.SEVEN;
                        break;
                    case(8):
                        rank = CardRank.EIGHT;
                        break;
                    case(9):
                        rank = CardRank.NINE;
                        break;
                    case(10):
                        rank = CardRank.TEN;
                        break;
                    case(11):
                        rank = CardRank.JACK;
                        break;
                    case(12):
                        rank = CardRank.QUEEN;
                        break;
                    case(13):
                        rank = CardRank.KING;
                        break;
                    case(14):
                        rank = CardRank.ACE;
                        break;
                    default:
                        rank = null;
                }
                this.deck.add(new PlayingCard(rank, suit, i));
            
            }
        
        }
        System.out.println(deck.size());
    }
    
    public void shuffle() {
        System.out.println("Shuffling Deck");
        Random rand = new Random();
        
        int limit = rand.nextInt(1000);
        int shuffleLimit = limit + 100;
        int i = 0;
        
        while (i < shuffleLimit) {
        
            int r1 = rand.nextInt(52);
            int r2 = rand.nextInt(52);

            Card hold1 = deck.get(r1);
            Card hold2 = deck.get(r2);
            deck.set(r2, hold1);
            deck.set(r1, hold2);
            
            i++;
        }
        
    }
    
    public void runGame() {
        environment.drawCard(0);
        environment.compare();
        environment.play();
    }
  
}
