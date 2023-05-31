package Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface RemoteControlCar {   
   void drive();
   int getDistanceTraveled();
}

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
   private int units;
   private int victories;

   @Override
   public void drive() {
      units += 10;
   }

   @Override
   public int getDistanceTraveled() {
      return units;
   }

   public void setNumberOfVictories(int number) {
      victories = number;
   }

   @Override
   public int compareTo(ProductionRemoteControlCar other) {
      return Integer.compare(other.victories, victories); // Sort in descending order of victories
   }
}

class ExperimentalRemoteControlCar implements RemoteControlCar {
   private int units;

   @Override
   public void drive() {
      units += 20;
   }

   @Override
   public int getDistanceTraveled() {
      return units;
   }
}

class TestTrack {
   private int units;

   void race(RemoteControlCar car) {
      car.drive();
   }

   List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar... cars) {
      List<ProductionRemoteControlCar> sortedCars = new ArrayList<>(Arrays.asList(cars));
      sortedCars.sort(Comparable::compareTo); // Sort in descending order of victories
      return sortedCars;
   }
}

public class RemoteControlCompetition {
   public static void main(String[] args) {
      ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
      ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
      prc1.setNumberOfVictories(3);
      prc2.setNumberOfVictories(2);

      List<ProductionRemoteControlCar> rankings = new TestTrack().getRankedCars(prc1, prc2);
   }
}



