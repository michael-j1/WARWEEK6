package week6;

import java.util.ArrayList;
import java.util.List;
/*
 Player
Fields
hand (List of Card)
score (set to 0 in the constructor)
name
Methods
describe (prints out information about the player and calls the describe method for each card in the Hand List)
flip (removes and returns the top card of the Hand)
draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
incrementScore (adds 1 to the Player’s score field)
*/

public class Player { //_______________________player begin
 
	String name;
    int score; // (will be set to 0 below )
//______________________________________________hand field________

  List<Card> hand = new ArrayList<>();
  
  //_________________________________________________constructor_______

  Player(String name, List<Card> hand) {
    this.name = name;
    this.score = 0;
    this.hand = hand;} // ____________________________end constructor_________________

  
//_______________________________________getters and setters begin_______________________

  public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public List<Card> getHand() {
	return hand;
}

public void setHand(List<Card> hand) {
	this.hand = hand;
}
//________________________________________getter setter END_______

public void draw (Deck cards) {
  Card newCard = cards.draw();
  this.hand.add(newCard);
} //___________________________________________ draw Method above

public void describeHand() {
  for (Card card : hand) {
    card.describeCard();
  
  } 

} 

//_____________________________________________flip METHOD

    public Card flip() {
       if (this.hand.size() > 0) {
        Card flipCard = this.hand.get(0);
          this.hand.remove(0);//_____removes top card
         return flipCard;
       } else {
         return null;} 

    
    } //_____________________________________end of flip METHOD

  //__________________________________________ begin Score method
  
    public void incrementScore() {
    this.score += 1;}
  //____________________________________________Score method END

  
  
  
  
}//______________________________________________player class END___