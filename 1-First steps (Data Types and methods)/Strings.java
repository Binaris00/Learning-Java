public class Strings {
   public static void main(String[] args) {
      // I create this because I want to use and practice with strings methods and others things
      // Strings are immutable when they are created (Important)

      // Sentence
      String sentence = "Good Morning World!";

      // Word
      String word = "Hello";

      

      // Simple UpperCase and LowerCase methods
      // Obviously you can use System.out.println(sentence.toUpperCase()) instead
      sentence = sentence.toUpperCase();
      System.out.println(sentence);

      sentence = sentence.toLowerCase();
      System.out.println(sentence);



      // Char Array and compare to find a UpperCase chars
      char[] wordCharArr = word.toCharArray();
      System.out.println(wordCharArr);
      for (int i = 0; i < wordCharArr.length; i++) {if (Character.isUpperCase(wordCharArr[i])){System.out.println(wordCharArr[i] + " Is a Upper Case");}}


      // View the specific char for a String
      System.out.println(word.charAt(0));

      word.isBlank();
      





   }
}
