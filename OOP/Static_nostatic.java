package OOP;

public class Static_nostatic {
   /*Exercise 1

   Create a class called Counter with a static variable called counter. 
   The counter variable should be initialized to 0. Create a method called 
   incrementCounter() that increments the value of the counter variable by 1. 
   Create a method called getCounter() that returns the value of the counter variable.

   Exercise 2

   Create a class called Person with a non-static 
   variable called name. The name variable should be 
   initialized to an empty string. Create a method called setName() 
   that sets the value of the name variable. Create a method called getName() 
   that returns the value of the name variable.

   Exercise 3

   Create a class called Math with a static method called sum(). 
   The sum() method should take two integer parameters and return the sum of the two parameters.
    * 
    */

}

class Counter {
    static int counter = 0;

    public void incrementCounter(){
        counter += 1;
    }

    public int getCounter(){
        return counter;
    }

}

class Person {
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}

class Math {
    public int sum(int a, int b){
        return a+b;
    }
}