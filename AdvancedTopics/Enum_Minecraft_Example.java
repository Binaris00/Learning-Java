package AdvancedTopics;

public enum Enum_Minecraft_Example {
   WOOD(10, 5), 
   STONE(20, 10),
   IRON(30, 30),
   GOLD(10, 40),
   DIAMOND(50, 50);


   private final int durability;
   private final int speed;

   Enum_Minecraft_Example(int durability, int speed){
      this.durability = durability;
      this.speed = speed;
   }

   public int getDurability() {return this.durability;}
   public int getSpeed() {return this.speed;}

   





}
