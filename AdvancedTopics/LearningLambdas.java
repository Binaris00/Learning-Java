package AdvancedTopics;

interface Math{
  /*
   * Yes
   */

  int numbers(int num1, int num2);
}


public class LearningLambdas {

  public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5}; 

      Math sum = (num1, num2) -> {return num1 + num2;};

   }
}
