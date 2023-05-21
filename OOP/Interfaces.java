package OOP;



interface Template{
   String message = "Hello World!";

   int number = 10;

   void printer();

}


public class Interfaces implements Template{

   @Override
   public void printer() {
      System.out.println(message);
   }

   public static void main(String[] args) {
      Interfaces i = new Interfaces();
      
      i.printer();
   }
   

}
