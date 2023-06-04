package Exercism;

public class Two_fer {
   // This was my solution to the problem but I don't read very much the problem so the best solution is twofer method
   public static String extra_Cookie(String name){
      switch (name){
         case "Alice":
            return "One for Alice, one for me.";
         case "Bohdan":
            return "One for Bohdan, one for me.";
         case "Zaphod":
            return "One for Zaphod, one for me.";
         default: return "One for you, one for me.";
      }
   }

   public static String twofer(String name){
      return String.format("One for %s, one for me", name != null ? name : "you");
   }

   public static void main(String[] args) {
      System.out.println(Two_fer.twofer("That man"));
      System.out.println(Two_fer.twofer("Alice"));
      System.out.println(Two_fer.extra_Cookie("Zaphod"));
      System.out.println(Two_fer.extra_Cookie("Bohdan"));

   }
}
