import java.util.function.DoubleConsumer;

import javax.swing.Action;

public abstract class EnemyShip {

    
   private String name;
   private double atmDamage;

   public String getName(){return name;}
   public void setName(String newName){name= newName;}

   public double getDamage(){return atmDamage;}
   public void setamtDamage(Double newDamage){atmDamage= newDamage;}
   
   
   public void followHeroShip()
   {
       System.out.println(getName() + " is following the hero ship");
   };
   public void displayEnemyShip()
   {
    System.out.println(getName() + " is on the screen");
   };
   public void enemyShipShoots()
   {
    System.out.println(getName()+" Attacks and does "+ getDamage());
   };
   

 
    
}
