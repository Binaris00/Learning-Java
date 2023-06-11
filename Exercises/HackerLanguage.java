package Exercises;

import java.util.HashMap;

/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

public class HackerLanguage {

   static String message = "Hello World";
   public static void main(String[] args) {
      HashMap<Character, String> convertors = new HashMap<>();
      convertors.put('a', "4");
      convertors.put('b', "I3");
      convertors.put('c', "[");
      convertors.put('d', ")");
      convertors.put('e', "3");
      convertors.put('f', "|=");
      convertors.put('g', "&");
      convertors.put('h', "#");
      convertors.put('i', "1");
      convertors.put('j', ",_|");
      convertors.put('k', ">|");
      convertors.put('l', "1");
      convertors.put('m', "JVI");
      convertors.put('n', "^/");
      convertors.put('o', "0");
      convertors.put('p', "|*");
      convertors.put('q', "(_,)");
      convertors.put('r', "12");
      convertors.put('s', "5");
      convertors.put('t', "7");
      convertors.put('u', "(_)");
      convertors.put('v', "|/");
      convertors.put('w', "VV");
      convertors.put('x', "><");
      convertors.put('y', "j");
      convertors.put('z', "2");
      convertors.put(' ', " ");


      for (int i=0; i < message.toCharArray().length;i++){
         System.out.print(convertors.get(message.toLowerCase().toCharArray()[i]));
      }
   }
}
