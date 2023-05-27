package DataStructures;

import java.util.List;

public class ListTest {
   public static void main(String[] args) {
         

      // Immutable
      List<Integer> numbers = List.of(1, 3, 5, 6, 7);
      List<Boolean> booleans = List.of(true, false, false, false);
      List<String> strings = List.of("Hola", "Adios", "Hi", "GoodBye");


      numbers.add(5, 2);
      System.out.println(numbers);




   }
}
