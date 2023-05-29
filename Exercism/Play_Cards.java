package Exercism;

public class Play_Cards {
   
   boolean isBlackJack = true;
   int dealerScore = 7;
   
   public int parseCard(String card){
      switch(card){
         case "ace": {return 11;}
         case "two": {return 2;}
         case "three": {return 3;}
         case "four": {return 4;}
         case "five": {return 5;}
         case "six": {return 6;}
         case "seven": {return 7;}
         case "eight": {return 8;}
         case "nine": {return 9;}
         case "ten": case "jack": case "queen": {return 10;}
         default: {return 0;}
      }
   }

   public boolean isBlackjack(String first_card, String second_card){
      return parseCard("queen") + parseCard("ace") == 21;
   }

   public String largeHand(boolean isBlackjack, int dealerScore) {
      if (!isBlackjack) {
          return "S";
      }
      if (dealerScore < 10) {
          return "W";
      }
      return "S";
   }

   public String smallHand(int handScore, int dealerScore) {
      if (handScore <= 11 || (dealerScore >= 7 && handScore < 17)) {
          return "H";
      }
      return "S";
  }


}
