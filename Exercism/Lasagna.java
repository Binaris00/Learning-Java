package Exercism;
/*
 * This exercise is from
 * https://exercism.org/tracks/java/exercises/lasagna
 * 
 * If you want to see the original exercise you just need to check the link
 */


public class Lasagna {
   
   public int expectedMinutesInOven(){
      return 40;
   }

   public int remainingMinutesInOven(int minutes){
      //The program return zero if the minutes var is older than 40 minutes return 0
      if (minutes < 40){
         return 40-minutes;
      }
      else{
         return 0;
      }
   }

   public int preparationTimeInMinutes(int layer){
      return layer*2;
   }

   public int totalTimeInMinutes(int layer, int minutes){
      return (layer*2) + minutes;
   }

   public static void main(String[] args) {
      Lasagna junior = new Lasagna();
      System.out.println(junior.expectedMinutesInOven());
      System.out.println(junior.remainingMinutesInOven(30));
      System.out.println(junior.preparationTimeInMinutes(2));
      System.out.println(junior.totalTimeInMinutes(3, 20));
      
   }
}
