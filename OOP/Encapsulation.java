package OOP;

class Cellphone{
   private String model;
   private int battery;


   public Cellphone(String model, int battery) {
      this.model = model;
      this.battery = battery;
   }


   public String getmodel(){
      return model;
   }


   public void setmodel(String model){
      this.model = model;
   }


   public int getbattery(){
      return battery;
   }


   public void setbattery(int battery){
      this.battery = battery;
   }



}


public class Encapsulation {

   public static void main(String[] args) {
      Cellphone cell = new Cellphone("AS10", 100);

      System.out.println(cell.getmodel());
   }
}
