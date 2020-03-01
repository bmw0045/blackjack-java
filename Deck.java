import java.util.*;

public class Deck {

   public Card[] deck;
   private int cardsDealt;
   
   public Deck() {
      deck = new Card[52];
      int cardCount = 0;
      // loop to create a deck of cards
      for(int suit = 0; suit <= 3; suit++) {
         for(int rank = 1; rank <= 13; rank++) {
            deck[cardCount] = new Card(rank, suit);
            cardCount++;
         }
      }
      cardsDealt = 0;   
   }
   
   public void shuffle() {
      for(int i=51; i > 0; i--) {
         int ranNum = (int)(Math.random() * (i+1));
         Card temp = deck[i];
         deck[i] = deck[ranNum];
         deck[ranNum] = temp;
      }
      System.out.println("**shuffling...**");
      cardsDealt = 0;
   }
   
   public Card dealCard() {
      if (cardsDealt == 52)
         shuffle();
      cardsDealt++;
      return deck[cardsDealt - 1];
   }
       

}