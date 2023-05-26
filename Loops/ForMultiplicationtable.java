package Loops;
public class ForMultiplicationtable{
   public static void main(String[] args) {
      for (int first=1;first<=10;first++){

         if (first != 1){System.out.println("");}


         System.out.println("Table of "+first);
         for (int second=1;second<=10;second++){
            
            for (int result=0;result<1;result++){
               System.out.println(first+"x"+second+"= "+first*second);
            }
         }
      }
   }
}