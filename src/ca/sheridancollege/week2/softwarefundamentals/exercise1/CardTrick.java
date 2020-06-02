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
        
        Scanner in = new Scanner(System.in);
        int val;
        String su;
        System.out.println("Enter the Card value( 1- 13)");//insert code to ask the user for Card value and suit, create their card
        val = in.nextInt();
        System.out.println("Enter the Card Suit(Hearts, Diamonds, Spades , Clubs)");
        su = in.next();
        
        int flag=0;
        for(i=0;i<magicHand.length;i++){       
        if(magicHand[i].getValue() == val){ 
                if(magicHand[i].getSuit().equals(su)==true){            // and search magicHand here
         System.out.println("Your card is found on the magic hand");     //Then report the result here
         flag=1;
         break;
                }
        }
        }
        
        if(flag==0){
         System.out.println("Your card is not found in the magic hand");
        }
    }
    
}
