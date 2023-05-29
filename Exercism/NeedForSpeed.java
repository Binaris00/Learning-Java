package Exercism;


class RaceTrack {

   int distance;

   public RaceTrack(int distance){
      this.distance = distance;
   }

   public boolean tryFinishTrack(NeedForSpeed car){
      if ((this.distance/car.speed)*car.batteryDrain <= car.battery){
         car.meters += this.distance; 
         return true;
      }
      else{
         return false;
      }
   }

}

public class NeedForSpeed {
   int speed;
   int batteryDrain;
   int battery = 100;
   int meters = 0;


   public NeedForSpeed(int speed, int batteryDrain){
      this.speed = speed;
      this.batteryDrain = batteryDrain;
   }

   public static NeedForSpeed nitro(){
      var car = new NeedForSpeed(50, 4);
      return car;
   }

   public void drive(){meters += speed;}

   public int distanceDriven(){return this.meters;}

   public boolean batteryDrained(){
      return battery <= 0;
   }

   public static void main(String[] args) {
      var car = new NeedForSpeed(5, 2);
      var raceTrack = new RaceTrack(800);

      var nitro_car = NeedForSpeed.nitro();
   }
}
