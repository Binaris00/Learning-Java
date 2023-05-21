package OOP;

class Color{
   String name;
   String hex;

   public void setInfo(String name, String hex){
      this.name = name;
      this.hex = hex;
   }

   public String getInfo(){
         return "Color name: "+ this.name + " hex: "+ this.hex;
      }
}


public class CreatingObjects {
   public static void main(String[] args) {
      Color red = new Color();
      red.setInfo("Red", "#fc0303");

      System.out.println(red.getInfo());
   }
}
