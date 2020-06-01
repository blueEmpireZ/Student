/*
*ID :991587501
*Exercise 1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *@modifierHarmandeep Kaur
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
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValue());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[C.randomSuit()]);
            magicHand[i]=c;
            System.out.println(magicHand[i].getSuit()+" "+magicHand[i].getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner c = new Scanner(System.in);
        System.out.print("/nenter a suit of a card (Hearts, Diamonds, Spades, Clubs): ");
        String s = c.nextLine();
         System.out.print(enter a value of a card : ");
         int v = c.nextInt(); 
          boolean valid;
          for (Card magicHand1 : magicHand) {
              if ( magicHand1.equals(magicHands1.getValue() && (suit.equals(magicHands1.getSuit()))) {
                  System.out.println("your card is in magicHand");
              }else{
                   System.out.println("your card is not  in magicHand");
              }
                  }
                  Card LuckyCard=new Card();
                  LuckyCard.setValue(3);
                  LuckyCard.setSuit("spades");
                  System.out.println(LuckyCard.getValue() +" "+ LuckyCard.getSuit());
                  boolean valid;
                  for(int i=0; i<magicHand.length;i++) {
                      if(LuckyCard.getValue()==(magicHand[i].getValue90&&LuckyCard.getSuit().equals(magicHand[i].getSuit())){
                          System.out.println("you got right");
                      }else{
                          
                  System.out.println("you lose");
                      }
                         }
                  
                  
        
        
    }
    
}
