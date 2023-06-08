package Random;
import java.util.Scanner;



public class Trivia {
   // This is not the best program but it just a practice about basic 
   // things in java (variables, booleans, if-else statements etc).
   static String first_question = "What's the the black and white Spiderman presented in Spiderman into the Spiderverse";
   static String second_question = "What's the protagonist of the Spiderman into the spiderverse";
   static String third_question = "What're the colors for the spot in Spiderman across the Spiderverse";

   static String correct_first_answer = "Noir";
   static String correct_second_answer = "Miles";
   static String correct_third_answer = "Black and White";
   
   public static void main(String[] args) {
      int points = 0;

      try (Scanner scanner = new Scanner(System.in)) {
         System.out.println(first_question);
         String first_answer = scanner.nextLine();
         if (first_answer.equals(correct_first_answer)){points += 1;} else{System.out.println("Incorrect, this is the correct answer: " + correct_first_answer);}

         System.out.println(second_question);
         String second_answer = scanner.nextLine();
         if (second_answer.equals(correct_second_answer)){points += 1;} else{System.out.println("Incorrect, this is the correct answer: " + correct_second_answer);}

         System.out.println(third_question);
         String third_answer = scanner.nextLine();
         if (third_answer.equals(correct_third_answer)){points += 1;} else{System.out.println("Incorrect this is the correct answer: " + correct_third_answer);}
      }

      System.out.println("Finished, this is your final score: " + points);

   }
}
