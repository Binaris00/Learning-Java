package Exercism;

public class ElonsToyCar {
   int meter = 0;
   int battery = 100;

   static ElonsToyCar buy() {
      return new ElonsToyCar();
   }

   public String distanceDisplay() {
      return "Driven " + meter + " meters";
   }

   public String batteryDisplay() {
      if (battery > 0) {
         return "Battery at " + battery + "%";
      } else {
         return "Battery empty";
      }
   }

   public void drive() {
      if (battery > 0) {
         meter += 20;
         battery -= 1;
      }
   }
}