package Exercism;
/*
 * This exercise is from
 * https://exercism.org/tracks/java/exercises/bird-watcher
 * 
 * If you want to see the original exercise you just need to check the link
 */


public class BirdWatcher {
   int[] birdlastweek = {0, 2, 5, 3, 7, 8, 4};
   
   
   public int[] getLastWeek(){return birdlastweek;}

   public int getToday(){return birdlastweek[birdlastweek.length - 1];}

   public void incrementTodaysCount(){birdlastweek[birdlastweek.length - 1] += 1;}

   public boolean hasDayWithoutBirds(){
      if (birdlastweek[birdlastweek.length -1] == 0){
         return true;
      }

      else{
         return false;
      }
   }

   public int getCountForFirstDays(int days){
      int count = 0;
      for (int counter=0; counter<days;counter++){
         count += birdlastweek[counter];
      }

      return count;
   }
   
   public int getBusyDays(){
      int count = 0;
      for (int day:birdlastweek){
         if (day >= 5){
            count += 1;
         }
      }

      return count;
   }


}
