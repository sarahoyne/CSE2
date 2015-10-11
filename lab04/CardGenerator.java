public class CardGenerator {
    //main method required for every Java program
    public static void main(String[] args) {
      int randomCard = ((int)(Math.random()*14)+2);
      int randomSuit = ((int)(Math.random()*4)+1);
      String suit= "x";
      if(randomSuit==1){
        suit = "Hearts";
    
      }
      if(randomSuit==2){
        suit = "Clubs";
      
      }
      if(randomSuit==3){
        suit = "Diamonds";
      
      }
      if(randomSuit==4){
        suit = "Spades";
      }
      String highCards = "9";
      switch(randomCard) {
        case 11:
          highCards = "Jack";
        break;
        case 12:
          highCards = "Queen";
        break;
        case 13:
          highCards = "King";
          break;
        case 14:
          highCards = "Ace";
          break;
      
      }
 if(randomCard<=10){
   System.out.println("You have the " + randomCard + " of " + suit);
 }
  else{
    System.out.println("You have the " + highCards + " of " + suit);
  }
    }
}