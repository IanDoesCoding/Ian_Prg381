import javax.lang.model.util.ElementScanner14;

public class EnemyShipFactory {
    

    public EnemyShip GetShip (String Userchoice)
    {

        if(Userchoice.equals("U"))
        {
            return new UFOEnemyShip();
        }
        else 
        if(Userchoice.equals("R"))
        {
            return new RocketEnemyShip();
        }
       else 
       {
           System.out.println("Please choose a correct option");
           return new UFOEnemyShip();
       }



    }
    public  void Actions(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.enemyShipShoots();
        anEnemyShip.followHeroShip();


    }
        
    }

