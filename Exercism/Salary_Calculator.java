package Exercism;

public class Salary_Calculator {
   public static double multiplierPerDaysSkipped(int daysSkipped){
      return daysSkipped >= 5 ? 0.85:1.0;
   }

   public static double multiplierPerProductsSold(int productsSold){
      return productsSold >= 20 ? 13:10;   
   }

   public static double bonusForProductSold(int productsSold){
      return productsSold*multiplierPerProductsSold(productsSold);
   }

   public static double finalSalary(int daysSkipped, int productsSold){
      double salary = 1000.00 + bonusForProductSold(productsSold)* multiplierPerDaysSkipped(daysSkipped);
      return salary > 2000.00 ? 2000.00 : salary;
   }

   public static void main(String[] args) {
      System.out.println(Salary_Calculator.multiplierPerDaysSkipped(7));
      System.out.println(Salary_Calculator.bonusForProductSold(3));
      System.out.println(Salary_Calculator.finalSalary(2, 3));
   }
}

