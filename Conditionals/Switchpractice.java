package Conditionals;

public class Switchpractice {
   public static void main(String[] args){
         int number = 5;
         switch(number){
            case 1:
               System.out.println("one");
               break;
            case 2:
               System.out.println("two");
               break;
            case 3:
               System.out.println("three");
               break;
            case 4:
               System.out.println("four");
               break;
            case 5:
               System.out.println("five");
               break;

         }
   }

   public static String swpractice(String text){
      switch(text){
         case "one":
            return "one";
         case "two":
            return "two";
         case "three":
            return "three";
      }
      return text;
   }
}
