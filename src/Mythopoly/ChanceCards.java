package Mythopoly;

import java.util.LinkedList;
import java.util.Random;

public class ChanceCards {
    
     private LinkedList<ChanceCard> ChanceCards = new LinkedList<>(); //List of possible chance cards
     
     private Random RandomGen = new Random();

     private void   AddDefaultCards() {
         ChanceCards.add(new ChanceCard("Mythical Vet Bill",-150));
         ChanceCards.add(new ChanceCard("Mythical Food Bill",-65));
         ChanceCards.add(new ChanceCard("Destruction of Property Bill",-250));
         ChanceCards.add(new ChanceCard("Mythical Tax",-100));
         ChanceCards.add(new ChanceCard("Pay A Fine For Not Cleaning Up After Your Animal",-50));
         ChanceCards.add(new ChanceCard("Speeding Fine",-85));
         ChanceCards.add(new ChanceCard("You Dropped Money Down A Drain",-45));
         ChanceCards.add(new ChanceCard("A Dragon Stole Your Wallet",-125));
         ChanceCards.add(new ChanceCard("A Mythical Animal Has Broken Your Arm",-175));
         ChanceCards.add(new ChanceCard("Animal Dentist Fee",-95));
         ChanceCards.add(new ChanceCard("You Return A Leprechaun His Pot Of Gold",80));
         ChanceCards.add(new ChanceCard("You Have Found A Valuable Dragon Scale",135));
         ChanceCards.add(new ChanceCard("You Have Found A Piece Of Gold",225));
         ChanceCards.add(new ChanceCard("You Found Money On The Floor",15));
         ChanceCards.add(new ChanceCard("You Have Fought Well In Battle",125));
         ChanceCards.add(new ChanceCard("You Have Been Wrongly Accused Of Illegally Breeding Mythical Craetures",105));
         ChanceCards.add(new ChanceCard("A Rich Entrepreneur Has Left You A Inheritence",250));
         ChanceCards.add(new ChanceCard("Bank Error In Your Favour",200));
         ChanceCards.add(new ChanceCard("Your Mythical Animal Won A Race",75));
         ChanceCards.add(new ChanceCard("Your Mythical Animal Has Won A Beauty Competition",50));
     }
     
     public void    Initialise() {
         AddDefaultCards();
         ShuffleCards();
     }
     
     private void ShuffleCards(){  //shuffles the chance cards
         LinkedList<ChanceCard> tShuffleCards = new LinkedList<>();
         while(true){
             ChanceCard tPickedCard = RemoveRandomCard();
             if(tPickedCard == null)  break;
             tShuffleCards.add(tPickedCard);
         }
         ChanceCards = tShuffleCards;
     }
     public void PrintCards(){  //prints out the chance cards
         System.out.printf("%d Cards\n", ChanceCards.size());
         for(ChanceCard tChanceCard : ChanceCards){
             System.out.println(tChanceCard);
         }
     }
     
     private ChanceCard RemoveRandomCard(){
        ChanceCard tChanceCard = null;
        int tCount = ChanceCards.size();
        if(tCount>0){
            int tPickIndex=RandomGen.nextInt(tCount);
            return ChanceCards.remove(tPickIndex);
        }
        return tChanceCard;
     }
     
     public ChanceCard GetTopCard(){
        ChanceCard tChanceCard = ChanceCards.removeFirst();
        ChanceCards.addLast(tChanceCard);
        return tChanceCard;
     }
}
