package AdvancedTopics;

import java.nio.file.Files;
import java.nio.file.Path;

public class UsingFiles {
   public static void main(String[] args) {
      Path path = Path.of("text.txt");
      boolean exist = Files.exists(path);
      
      System.out.println(path.getName(0));
      System.out.println(path.toString());
      System.out.println(exist ? "The text.txt exists" : "The text is not present");
      
   }
}
