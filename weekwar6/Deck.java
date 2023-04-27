package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*Deck
Fields:
cards (List of Card)
Methods
shuffle (randomizes the order of the cards)
draw (removes and returns the top card of the Cards field)
In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
*/
public class Deck {//begin deck


	  List<Card> cardsList = new ArrayList<>();

	  Deck() { // _____________________________________Deck ___________________
	  
	    String[] suits = {"Diamonds", "Spades", "Hearts", "Clubs"};
	    
	    String[] num = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};	
	
	    for (String suit : suits) { // enhanced for loop
	        int count = 2; // __________________________ 2 - 14
	    
	        for (String number : num) { // nested loop
	          Card card = new Card(number, suit, count); // instantiate a new card for each card we want to create
              Deck deck = this;
			deck.cardsList.add(card);// ___________________adds instantiated card 
              count++; 
	  } 
	  }
	  }
// __________________________________________Method to Shuffle the Deck_____________________________

	  public void shuffle() {
      Collections.shuffle(this.cardsList);}

//_______________________________________________method to draw_______________________________________________
  public Card draw() {
    Card card = this.cardsList.remove(0); // top card from deck 
    return card;
  } // _________________________________________________________

	
	}//end deck
