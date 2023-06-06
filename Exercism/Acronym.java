package Exercism;

public class Acronym {
   String png = "Portable Network Graphics";

   public static String find_acronyms(String word){
      String acr = "";

      for(int i=0 ; i < word.length(); i++){
         if(Character.isUpperCase(word.charAt(i))){
            acr += word.charAt(i);
            System.out.println(acr);}
         else {System.out.println("You need to use Upper case characters");}
      }
      
         return acr;
   }

   public static void main(String[] args) {
      System.out.println(Acronym.find_acronyms("Portable Network Graphics"));
   }
}

