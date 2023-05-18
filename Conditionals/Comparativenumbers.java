package Conditionals;

public class Comparativenumbers {
   public static void main(String[] args){
      System.out.println(comparative(1, 2)); // The answer is 2
      System.out.println(comparative(7, 5)); // The answer is 7
      System.out.println(comparative(7, 7)); // The answer is 7
   }

   public static int comparative(int a, int b){
      if(a <= b){
         return a;
      }
      else{
         return b;
      }
   }
}
