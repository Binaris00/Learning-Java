import java.util.Scanner;

public class try_catch {
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
         System.out.println("What's your name?");
         String name = scanner.nextLine();
         System.out.println("Your name is " + name);
      }
      catch(Exception e) {System.out.println(e);}   
   }
   
   
}
