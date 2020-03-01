import java.util.*;


public class Blackjack {
   
   public Hand dealerHand;
   public Hand userHand;

   public static void main(String[] args) {
      int bet;
      int money;
      boolean win;
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to the Blackjack Table!");
      System.out.print("\nEnter your bet amount (0 to leave the table): ");
      bet = scan.nextInt();
      playBlackjack();
   }

   public static void playBlackjack() {
      Deck deck;
      Hand dealerHand;
      Hand userHand;
      
      deck = new Deck();
      dealerHand = new Hand();
      userHand = new Hand();
      
      deck.shuffle();
      dealerHand.addCard(deck.dealCard());
      userHand.addCard(deck.dealCard());
      dealerHand.addCard(deck.dealCard());
      userHand.addCard(deck.dealCard());
      System.out.println("\nDealer has:");
      System.out.println(dealerHand.getCard(0));
      System.out.println(dealerHand.getCard(1));
      System.out.println("\nYou have: ");
      System.out.println(userHand.getCard(0));
      System.out.println(userHand.getCard(1));
       
   }

}