package DataStructures;
// https://www.w3resource.com/java-exercises/collection/index.php#hashset


import java.util.Map;
import java.util.Map.Entry;

public class MapsExercises {

   // 2. Write a Java program to iterate through all elements in a hash list.
   public static void hash_iterable(Map<Object, Object> hash){
      for (Entry<Object, Object> entry : hash.entrySet()){
         System.out.println(entry.getKey() + "=" + entry.getValue() + "\n");
      }
   }

   // 3. Write a Java program to get the number of elements in a hash set. (I use a Hash xd)
   public static int hash_elements(Map<Object, Object> hash){return hash.size();}

}
