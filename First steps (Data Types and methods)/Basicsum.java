public class Basicsum
{
   public static void main(String[] args){
      
      System.out.println("All the sums");
      System.out.println(sum(1, 1));
      System.out.println(sum(1, 2));
      System.out.println(sum(-1, 4));
      System.out.println(sum(-1, 5));

   }

   public static int sum(int a, int b){
      return a+b;
   }

   public static int sub(int a, int b){
      return a-b;
   }

   public static int mul(int a, int b){
      return a*b;
   }

   public static int division(int a, int b){
      return a/b;
   }
}