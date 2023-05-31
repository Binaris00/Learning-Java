package Exercism;



public class Cars_Assemble {
   public static double productionRatePerHour(double number){
      if (number <= 4){
         return (double)number*221;
      }

      else if (number <= 8 && number >= 5){
         return (double)(number*221) - ((number*221) * 0.1);
      }
      else if (number == 9){
         return (double)(number*221) - ((number*221) * 0.2);
      }
      else{
         return (double)(number*221) - ((number*221) * 0.23);
      }
   }

   public static int workingItemsPerMinute(int time){
      return (int)productionRatePerHour(time) / 60;
   }



   public static void main(String[] args) {
      System.out.println(Cars_Assemble.productionRatePerHour(6));
      System.out.println(Cars_Assemble.workingItemsPerMinute(6));
   }
}
