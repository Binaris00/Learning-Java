package Exercism;

public class Football_Match_Reports {
   public static String onField(int number){
      switch(number){
         case 1:
            return "goalie";
         case 2:
            return "left back";
         case 3: case 4:
            return "center back";
         case 5:
            return "right back";
         case 6: case 7: case 8:
            return "midfielder";
         case 9:
            return "left wing";
         case 10:
            return "striker";
         case 11:
            return "right wing";
         default:
            return "Throw IllegalArgumentException";
      }   
   }

   public static void main(String[] args) {
      System.out.println(Football_Match_Reports.onField(7));
   }
}
