package week6;

import java.util.HashMap;

public class Card {//begin
	
	/*1.
	 
Create the following classes:
a. Card:
Fields:
i.value (contains a value from 2-14 representing cards 2-Ace)
name (e.g. Ace of Diamonds, or Two of Hearts)
ii.Methods
Getters and Setters
describe (prints out information about a card)
Deck
Fields
cards (List of Card)
Methods shuffle (randomizes the order of the cards)
draw (removes and returns the top card of the Cards field)
In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
Player
Fields
hand (List of Card)
score (set to 0 in the constructor)
name
Methods describe (prints out information about the player and calls the describe method for each card in the Hand List)
flip (removes and returns the top card of the Hand)
draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
increment Score (adds 1 to the Player’s score field)
*/
	// __________________________________________________-fields
	  String name;
	  String suit;
	  int value;
	  HashMap<String, String> cardSuits = new HashMap<>();

	  // Constructor
	  public Card(String name, String suit, int value) {
	    this.name = name;
	    this.suit = suit;
	    this.value = value;} //end constructor
	  //_________________________________________________Getters and Setters > under source file

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	  
	  
//_______________________________________________________________________describe___________________________
  public void describeCard() { //_________illistrates game play
         
	     cardSuits.put("Diamonds", "red");
    
         cardSuits.put("Clubs", "black");
    
         cardSuits.put("Hearts", "red");
    
         cardSuits.put("Spades", "black");
         
   System.out.println(" " + this.name + " of" + cardSuits.get(this.suit) + " " + this.value );
  }
	
	
	
	
	}//______________________________________________END card class
