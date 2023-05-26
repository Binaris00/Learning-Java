package Loops;

public class WhileMultiplicationTable {
   public static void main(String[] args) {
      

      int first = 1;

      while (first != 11){

         for (int second = 1;second<=10;second++){
            System.out.println(first + "x" + second + "= " + first*second);
         }

         first++;
      }


   }
}
