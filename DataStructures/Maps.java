package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
   public static void main(String[] args) {

      Map<String, Integer> students_age = new HashMap<String, Integer>();
      
      students_age.put("Maria", 12);
      students_age.put("Jose", 26);
      students_age.put("Arturo", 1);
      students_age.put("Mario", 19);

      for (Entry<String, Integer> student : students_age.entrySet()){
         if (student.getValue() > 18){
            System.out.println(student.getKey() + " have full age");
            System.out.println(student.getValue());
         }
         else{
           System.out.println(student.getKey());
           System.out.println(student.getValue());
         }
      }
   }
   
}
