package OOP;

interface Vehicle {

   void changeWheels(int wheels);
   void speedUp(int speed);
   void speedDown(int speed);

}


class Bike implements Vehicle {
   int wheels;
   int speed;

   
   @Override
   public void changeWheels(int wheels) {
      this.wheels = wheels;
      System.out.println("Bike change wheels");
   }
   @Override
   public void speedUp(int speed) {
      this.speed += speed;
      System.out.println("Bike speed up");
   }
   @Override
   public void speedDown(int speed) {
      this.speed -= speed;
      System.out.println("Bike speed down");
   }

}

class Car implements Vehicle {
   int wheels;
   int speed;

   @Override
   public void changeWheels(int wheels) {
      this.wheels = wheels;
      System.out.println("Car change wheels");
   }

   @Override
   public void speedUp(int speed) {
      this.speed += speed;
      System.out.println("Car speed up");
   }

   @Override
   public void speedDown(int speed) {
      this.speed -= speed;
      System.out.println("Car speed down");
   }

}

public class VehicleInterface {
   public static void main(String[] args){
      Bike b = new Bike();
      
      Car c = new Car();

      b.changeWheels(4);
      c.changeWheels(4);

      b.speedUp(10);
      c.speedUp(10);

      b.speedDown(10);
      c.speedDown(10);


   }
}
