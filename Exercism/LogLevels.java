package Exercism;

public class LogLevels {
   
   public static String message(String text){
      text = text.replace("  ", " ");
      text = text.replace("\r", "");
      text = text.replace("\n", "");

      String[] text_splitted = text.split("]: ");
      return text_splitted[1];
   }


   public static String logLevel(String text){
      String[] text_splitted = text.split("]: ");
      text = text_splitted[0].replace("[", "").toLowerCase();
      return text;
   }

   public static String reformat(String text){
      String[] text_splitted = text.split("]: ");
      text_splitted[0] = text_splitted[0].replace("[", "").toLowerCase();
      return text_splitted[1] + " (" + text_splitted[0] + ")";
   }


   
   public static void main(String[] args) {
      System.out.println(LogLevels.message("[ERROR]:  Invalid operation\n\r"));
      System.out.println(LogLevels.logLevel("[ERROR]:  Invalid operation"));
      System.out.println(LogLevels.reformat("[INFO]: Operation completed"));
   
   }
}
