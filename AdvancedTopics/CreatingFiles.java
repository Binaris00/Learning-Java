package AdvancedTopics;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {
   public static void main(String[] args) {
      File file = new File("new_text.txt");
      try {
         if (file.createNewFile()){System.out.println("Created new file called: " + file);}
      }
      catch (IOException e) {System.out.println("" + e.getMessage());}     
   }
}
