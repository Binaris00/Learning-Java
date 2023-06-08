package DataStructures;

import java.util.HashSet;

public class HashSet_Exercises {
   // I use functions :)

   static HashSet<String> words = new HashSet<String>();
   static HashSet<String> another_words = new HashSet<String>();
   // 1. Write a Java program to append the specified element to the end of a hash set.
   public static void append_element(String s){
      words.add(s);
   }

   // 2. Write a Java program to iterate through all elements in a hash list.
   public static void iterate_elements(){
      for (String s : words){System.out.println(s);}
   }

   // 3. Write a Java program to get the number of elements in a hash set.
   public static int get_number_of_elements(){return words.size();}

   // Write a Java program to empty an hash set.
   public static boolean empty(){return words.isEmpty();}

   // 5. Write a Java program to test if a hash set is empty or not.
   public static void test_empty(){
      if (words.isEmpty() == false){
         System.out.println("Removing all the elements");
         words.removeAll(words);
         System.out.println("This is the hashSet now: " + words);
      }
      else{System.out.println("The hashSet is Empty");}
   }

   // 6. Write a Java program to clone a hash set to another hash set.

   //7. Write a Java program to convert a hash set to an array.
   public static void hashSet_to_array(){
      String[] words_array = new String[words.size()];
      words.toArray(words_array);
   }

   

}
