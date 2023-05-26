package Loops;

public class Buclefor {
   public static void main(String[] args) {
      //Simple for to print number 1 to 10
      for (int i=1;i<=10;i++){
         System.out.println(i);
      }

      
      for (int number=1;number<=10;number++){
         System.out.println("6x" + number + "= " + 6*number);
      }
      
      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};

      for (int number:numbers){
         System.out.println(number);
      }
      
   }
}
