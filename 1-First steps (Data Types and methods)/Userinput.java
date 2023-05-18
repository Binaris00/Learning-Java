import java.util.Scanner;

public class Userinput {
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Can you say me your name?");
      String user = scanner.nextLine();

      System.out.println("Hello " + user);
   }
}
