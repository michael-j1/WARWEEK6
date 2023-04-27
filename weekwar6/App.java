package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 *Create a class called App with a main method.
Instantiate a Deck and two Players, call the shuffle method on the deck.
Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
Using a traditional for loop, iterate 26 times and call the flip method for each player.
Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
After the loop, compare the final score from each player. 
Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
 
 */
public class App {///____________class App 

	public static void main(String[] args) {//__________MainBegin
	
		Scanner checkYorN = new Scanner(System.in);

		 while (true) {
		 System.out.println(" Do You Want to play a Game?");
		 System.out.println("y for yes or n for 'nah, i'm good': ");
		 String input = checkYorN.nextLine();
		      
		      if (input.equals("Y") || input.equals("y")) {
		      Deck newDeck = new Deck();
	
		   System.out.println("Player 1: ");
		   String p1Name = checkYorN.nextLine();
		   System.out.println("Player 2: ");
		   String p2Name = checkYorN.nextLine();

		   System.out.println("Prepare");
	//_________________________________________________________________
		         
		        List<Card> p1Hand = new ArrayList<Card>();
		          List<Card> p2Hand = new ArrayList<Card>();

		          Player player1 = new Player(p1Name, p1Hand);
		          Player player2 = new Player(p2Name, p2Hand);
	
		   System.out.println("Shuffle");
		   newDeck.shuffle();
	//_________________________________________________________________
		   System.out.println("Let's Battle");
	        for (int i = 0; i < 52; i++) {
	          if (i % 2 == 0) {
	            p1Hand.add(newDeck.draw());
	          } //
	          else {
	            p2Hand.add(newDeck.draw());
	          } 
	        } 
	//_____________________________________________Flip method
	        
	        for (int b = 1; b < 27; b++) {
	          System.out.println("---------------");
	          System.out.println("*Round " + b );
	          Card card1 = player1.flip();
	          System.out.println("Player 1: " + player1.getName());
	          card1.describeCard();
	          Card card2 = player2.flip();
	          System.out.println("Player 2: " + player2.getName());
	          card2.describeCard();
	  //____________________________________________Compare and Score_____________________
	     
	     if (card1.getValue() > card2.getValue()) {
	            player1.incrementScore();
	            System.out.println("     -----     ");
	            System.out.println("Round " + b + " goes to: " + player1.getName());
                System.out.println(player1.getName() + "gets point for round " + b);
	            System.out.println("---------------\n");
	    } else if (card1.getValue() < card2.getValue()) {
	            player2.incrementScore();
	            System.out.println("     -----     ");
	            System.out.println("Round " + b + " goes to: " + player2.getName());
	            System.out.println(player2.getName() + "gets point for round " + b);
	            System.out.println("---------------\n");
	  } else {
	            System.out.println("  _______    ");
	            System.out.println("Nice try, but win, lose, or DRAW!");
	            System.out.println("___________________");
	          } 
	        } 
	   //_______________________________________________________Final Score ___________________     
	        
	        System.out.println("______________");
	        System.out.println("FINAL SCORE: ");
	        System.out.println("Player 1 : " + player1.getName() + ": " + player1.getScore());
	        System.out.println("Player 2 : " + player2.getName() + ": " + player1.getScore());
	        System.out.println("_______________");
	        
	        if (player1.getScore() > player2.getScore()) {
	          System.out.println(player1.getName().toUpperCase() + " wins!");
	        } else if (player1.getScore() < player2.getScore()) {
	          System.out.println(player2.getName().toUpperCase() + " wins!");
	        } else {
	          System.out.println("It's a draw!");
	        } 
	        System.out.println("_________________");

	      } else if 
		      (input.equals("n") || input.equals("N")) {
	           System.out.println("Maybe Another Time!");
	      break;
	   } else {
	        System.out.println("Thinking");
	      } 
	    } 
	    //closes scanner
	    checkYorN.close();
	        
	                        }//_____________main END

                            }//________________________________________ClassEND
