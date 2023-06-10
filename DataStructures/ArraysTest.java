package DataStructures;

import java.util.Scanner;

public class ArraysTest {
   public static void main(String[] args) {
      
      int[] array = new int[5];

      array[0] = 2;
      array[1] = 5;
      array[2] = 7;
      array[3] = 0;
      array[4] = 8;

      array[0] = 1;

      // System.out.println(array[0]);

      int[] new_array = {1, 2, 3, 4, 5};
      System.out.println(new_array[2]);
      System.out.println(new_array.length);

      String[] string_array = {"Hola", "Hello", "Bonjour"};
      System.out.println(string_array[1]);

      String[] user_array = new String[3];
      try (Scanner scanner = new Scanner(System.in)){
         System.out.println("New string value for this array:");

         user_array[0] = scanner.nextLine();
         System.out.println("Your value inserted is " + user_array[0]);
      }

   } 
}
