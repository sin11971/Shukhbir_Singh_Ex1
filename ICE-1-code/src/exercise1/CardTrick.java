package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Sukhbir Singh Mar 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
          Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
          
        
       
        
          //card.setValue(insert call to random number generator here)
        card.setValue(random.nextInt(13) + 1);
        //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
            //System.out.println(card); // comment this line 
        }
         // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        //     ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        System.out.println("Welcome to the Card Trick Game !");
        System.out.print("Enter a suit - (\"Heart\", \"Diamond\", \"Spade\", \"Club\"): ");
        String suit = scanner.nextLine();
        System.out.print("Enter a value - [1 - 13]: ");
        int val = scanner.nextInt();

        Card userCard = new Card();
        userCard.setSuit(suit);
        userCard.setValue(val);
        // Then loop through the cards in the array to see if there's a match.
        for (int i = 0; i < hand.length; i++) {
            if (userCard.getValue() ==hand[i].getValue() && userCard.getSuit().equalsIgnoreCase(hand[i].getSuit())) {
            
       // If the guess is successful, print System.out.println("Congratulations, you guessed right!");. 
                printInfo();
                return;
            }
        }
        System.out.println("You Loose! Card not found.");
        

        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Sukhbir Singh Mar 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sukhbir Singh, but you can call me Sukhi");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Plyaing Games");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
