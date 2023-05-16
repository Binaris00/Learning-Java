public class Creatingmethods {
   public static void main(String[] args){
      
      float result = suma(1, 2);
      System.out.println(result);
      
      String sresult = stringsum("This is a text ", "with other text");
      System.out.println(sresult);
   }

   public static float suma(float a, float b){
      return a + b;
   }

   public static String stringsum(String a, String b){
      return a + b;
   }

   public static String new_message(){
      return "This is a message";
   }
}
