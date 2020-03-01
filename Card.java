import java.util.*;

public class Card {

   // int for selecting suit
   public static final int HEARTS = 0,
                           DIAMONDS = 1,
                           SPADES = 2,
                           CLUBS = 3;
   // card type for special cases
   public static final int ACE = 1,
                           JACK = 11,
                           QUEEN = 12,
                           KING = 13;
   private final int suit;
   private final int rank;
   
   // constructs a card object with rank and suit params
   public Card(int theRank, int theSuit) {
      rank = theRank;
      suit = theSuit;
   }
   
   public int getRank() {
      return rank;
   }
   
   public int getSuit() {
      return suit;
   }
   
   public String getSuitAsString() {
         // returns a string of the card's suit.
      switch(suit) {
         case HEARTS: 
            return "Hearts";
         case DIAMONDS: 
            return "Diamonds";
         case SPADES: 
            return "Spades";
         case CLUBS: 
            return "Clubs";
         default:
            return "****";
      }
   }
   
   public String getRankAsString() {
         // returns a string of the card's rank.
      switch(rank) {
         case 1: 
            return "Ace";
         case 2: 
            return "2";
         case 3: 
            return "3";
         case 4: 
            return "4";
         case 5: 
            return "5";
         case 6: 
            return "6";
         case 7: 
            return "7";
         case 8: 
            return "8";
         case 9: 
            return "9";
         case 10: 
            return "10";
         case 11: 
            return "Jack";
         case 12: 
            return "Queen";
         case 13: 
            return "King";
         default:
            return "****";
      }
   }
   
   public String toString() {
      return getRankAsString() + " of " + getSuitAsString();
   }
   
}