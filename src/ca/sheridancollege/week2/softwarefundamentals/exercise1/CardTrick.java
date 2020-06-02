/*modifier: Aswin Nalumakkal Rajan
 *Student Id: 991591209

 */


package ca.sheridancollege.week2.softwarefundamentals.exercise1;
        import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        int i;
        for (i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValue());//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[c.randomSuit()]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i]=c;
            System.out.println(magicHand[i].getValue()+"  "+magicHand[i].getSuit());
        }
        
        Card luckyCard= new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Clubs");
        System.out.println("Lucky card has the value "+luckyCard.getValue()+" and suit "+luckyCard.getSuit());  //creating luckyCard
            
        
        int flag=0;
        for(i=0;i<magicHand.length;i++){       
        if(magicHand[i].getValue() == luckyCard.getValue()){ 
                if(magicHand[i].getSuit().equals(luckyCard.getSuit())==true){            // and search in luckyCard here
         System.out.println("Your luckyCard is found on the magic hand"); 
         System.out.println("You win");                           //  Then report the result here
         flag=1;
         break;
                }
        }
        }
        
        if(flag==0){
         System.out.println("Your luckyCard is not found in the magic hand");
         System.out.println("You lose");
        }
    }
    
}
