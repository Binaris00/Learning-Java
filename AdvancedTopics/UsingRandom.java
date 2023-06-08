package AdvancedTopics;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class UsingRandom {

   static Random random = new Random();
   static HashSet<Integer> numbers = new HashSet<Integer>();

   public static void randomHashSet(){
      while(10 > numbers.size()){
         numbers.add(random.nextInt(100));
      }

      System.out.println(numbers);
   }

   public static void analyst(){
      Iterator<Integer> i = numbers.iterator();
      int j = 0;
      while(i.hasNext()){
         int k = i.next();
         if (k > j){
            j = k;
         }
      }
      System.out.println(j);
   }

   public static void main(String[] args) {
      int random_number = random.nextInt(100);

      System.out.println("Using random number: " + random_number);
      UsingRandom.randomHashSet();
      UsingRandom.analyst();


   }
}
