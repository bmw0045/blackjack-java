import java.util.*;
import java.util.Vector;

public class Hand {
   
   private Vector<Card> hand;
   
   public Hand() {      //init
      hand = new Vector();
   }
   
   public void addCard(Card cur) {
      // check to make sure there is a card to be loaded.
      if(cur != null) 
         hand.addElement(cur); 
   }
   
   public void removeCard(Card cur) {
      hand.removeElement(cur);
   }
   
   public Card getCard(int pos) {
      if(pos < hand.size() && pos >= 0)
         return (Card)hand.elementAt(pos);
      else
         return null;
   }
   

}      
   
