/*
 * This exercise is from
 * https://exercism.org/tracks/java/exercises/karls-languages
 * 
 * If you want to see the original exercise you just need to check the link
 */


package Exercism;

import java.util.List;

public class Karls_Languages {
   
   List<String> languageList = List.of();

   public boolean isEmpty(){
      if (languageList.size() == 0){
         return true;
      }
      else{
         return false;
      }
   }

   public void addLanguage(String language){languageList.add(language);}

   public void removeLanguage(String language){languageList.remove(language);}
   
   public String firstLanguage(){return languageList.get(0);}

   public int count(){return languageList.size();}

   public boolean containsLanguage(String language){return languageList.contains(language);}

   public boolean isExciting(){
      return languageList.contains("Java") || languageList.contains("Kotlin");
   }
}

