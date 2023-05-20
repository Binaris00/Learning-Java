package Conditionals;

public class Conditionals_exercises {
   /*
    * 1- Given an integer, print "even" if it is even and "odd" if it is odd.
    * 2- Given a string, print "palindrome" if it is a palindrome and "not a palindrome" if it is not.
    */

    public static void main(String[] args){
      System.out.println(isEvenOdd(0));
      System.out.println(isEvenOdd(1));
      System.out.println(isEvenOdd(2));
      System.out.println(isEvenOdd(3));
      System.out.println(isEvenOdd(4));
      System.out.println(isEvenOdd(5));
      System.out.println(isEvenOdd(6));
      System.out.println(isEvenOdd(7));
      System.out.println(isEvenOdd(8));
      System.out.println(isEvenOdd(9));
      System.out.println(isEvenOdd(10));

      System.out.println(isPalindrome(""));
      System.out.println(isPalindrome("aba"));
      System.out.println(isPalindrome("abba"));
      System.out.println(isPalindrome("abc"));
      System.out.println(isPalindrome("abcd"));
    }

    public static String isEvenOdd(int number){
      
      if ((number % 2) == 0) {return number + " is even";}
      else {return number +" is odd";}

    }

    public static String isPalindrome(String word){
      String reverse_word = new StringBuilder(word).reverse().toString();
      
      if (word.equals(reverse_word)){
         return word + " is a palindrome";
      }

      else {return word + " is not a palindrome";}
   }
}
