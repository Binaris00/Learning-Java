package Exercism;

public class Hamming {
   public static int findDifference(String adn1, String adn2) {
      if (adn1.length() != adn2.length()){throw new IllegalArgumentException("Adn1 and Adn2 must be the same length");}
      
      int counter = 0;
      int difference = 0;
      char[] arr_adn1 = adn1.toCharArray();
      char[] arr_adn2 = adn2.toCharArray();

      while (arr_adn1.length-1 != counter){
         if (arr_adn1[counter] != arr_adn2[counter]){difference += 1;}
         counter++;
      }
      return difference;
   }     

   public static void main(String[] args) {
      System.out.println(Hamming.findDifference("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT"));
   }
}
