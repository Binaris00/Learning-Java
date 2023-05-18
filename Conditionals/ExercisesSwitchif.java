package Conditionals;

public class ExercisesSwitchif {
   public static void main(String[] args){


      System.out.println(first_exercise("Hello"));
   }




   public static String first_exercise(String text){
      /*
       * Exercise 1:
       * Use a switch statement when the value you are testing is a 
       * single, discrete value. For example, you could use a switch 
       * statement to test the value of a user input, 
       * or the value of a variable.
       */
      switch(text){
         case "Hi":
            return "Hi User!";
         case "Hello":
            return "Hello User!";
         case "Good bye":
            return "Good bye User!";
         default:
            return "?";
      }
   }

   public static String second_exercise(String text){
      /*
       * Exercise 2:
       * Use an if-else-else if statement when the value you are testing can be one of several values. For example, 
       * you could use an if-else-else if statement to test the value of a user input, 
       * and then perform different actions depending on the value of the input.
       */
      if (text == "Hi"){
         return "Hi User!";
      }
      else if (text == "Hello"){
         return "Hello User!";
      }
      else if (text == "Good bye"){
         return "Good bye User!";
      }
      else{
         return "?";
      }

   }

   public static void third_exercise(int number){
      /*
       * Exercise 3:
       * Use a break statement to exit a switch statement as soon as 
       * a matching case is found. This will prevent the rest of 
       * the cases from being executed.
       */

       switch (number){
         case 1:
            System.out.println("One");
            break;
         case 2:
            System.out.println("Two");
            break;
         case 3:
            System.out.println("Three");
            break;
         default:
            System.out.println("?");
            break;
      }

   }

   public static void fourth_exercise(int number){
      /*
       * Exercise 4:
       * Use a default case in a switch statement to 
       * handle values that do not match any of the other cases. 
       * The default case is often used to handle errors or unexpected values.
       * 
       */
      
       switch (number) {
         case 1:
            System.out.println("One");
         case 2:
            System.out.println("Two");
         default:
            System.out.println("Error");
       }
   }  

   public static void fifth_exercise(int number){
      /*
       * Exercise 5:
       * Use an else statement at the end of an if-else-else if statement 
       * to handle values that do not match any of the other conditions. 
       * The else statement is often used to handle errors or unexpected values.
       */
      
      if ((number % 3) == 0){
         System.out.println("Divisible by 3");
      }
      else if ((number % 5) == 0){
         System.out.println("Divisible by 5");
      }
      else
         System.out.println("Not divisible by 3 or 5");
   
   }
}
