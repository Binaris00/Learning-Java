package Exercises;


/*
* Escribe un programa que muestre por consola (con un print) los
* números de 1 a 100 (ambos incluidos y con un salto de línea entre
* cada impresión), sustituyendo los siguientes:
* - Múltiplos de 3 por la palabra "fizz".
* - Múltiplos de 5 por la palabra "buzz".
* - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
*/
public class FizzBuzz {
   public static void main(String[] args) {
      for(int num=1;num<=100;num++){
         if (num % 5 == 0 && num % 3 == 0){System.out.println("fizzbuzz");}
         else if (num % 5 == 0){System.out.println("buzz");}
         else if (num % 3 == 0){System.out.println("fizz");}
         else{System.out.println(num);}
      }
   }

   
}
