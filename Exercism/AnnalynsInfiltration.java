package Exercism;
/*
 * This exercise is from
 * https://exercism.org/tracks/java/exercises/annalyns-infiltration
 * 
 * If you want to see the original exercise you just need to check the link
 */


 public class AnnalynsInfiltration {

   public static boolean canFastAttack(boolean knightIsAwake) {
      return !knightIsAwake;
   }

   public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
      return !knightIsAwake && archerIsAwake && !prisonerIsAwake;
   }

   public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
      return !archerIsAwake && prisonerIsAwake;
   }

   public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
      return !knightIsAwake && archerIsAwake && !prisonerIsAwake && petDogIsPresent;
   }

   public static void main(String[] args) {
      boolean knightIsAwake = true;
      boolean archerIsAwake = false;
      boolean prisonerIsAwake = false;
      boolean petDogIsPresent = false;

      System.out.println(canFastAttack(knightIsAwake)); // false
      System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)); // true
      System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake)); // false
      System.out.println(canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)); // false
   }
}
