package Exercism;

class Warrior{
   public String toString(){return "Fighter is a Warrior";}

   public boolean isVulnerable(){return false;}

   public int damagePoints(Wizard wizard){return wizard.isVulnerable() ? 10:6;}
}


class Wizard extends Warrior{
   private boolean spellpreparated = false;
   
   public void prepareSpell(){this.spellpreparated = true;}

   @Override
   public boolean isVulnerable() {return true;}

   public int damagePoints(Warrior warrior){return spellpreparated ? 12:3;}

}
public class Wizards_and_Warriors {
   
}
