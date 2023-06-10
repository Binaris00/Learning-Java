package AdvancedTopics;

public class EnumDifficulty {
   
   enum Difficulty{

      EASY,
      MEDIUM,
      HARD;


   }
   
   
   public static void main(String[] args) {
      
      Difficulty game = Difficulty.HARD;

      switch(game){
         case EASY:
           System.out.println("You selected the easy difficult");
         case MEDIUM:
            System.out.println("You selected the medium difficulty");
         case HARD:
            System.out.println("You selected the hard difficulty"); 
      }

      for (Difficulty gamed: Difficulty.values()) {
         System.out.println(gamed);

      }
   }
}
