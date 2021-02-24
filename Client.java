import java.util.Scanner;

import javax.swing.Action;
import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

public class Client {
    
    public static void main(String[] args) {
        
        Scanner userinput = new Scanner(System.in);

        String Shiptype = "";

        System.out.println("What type of ship would you like it to be (U or R)");

        Shiptype = userinput.nextLine();
        EnemyShip Enemy = null;
        
     EnemyShipFactory factory = new EnemyShipFactory(); 
       
              factory.Actions(factory.GetShip(Shiptype)); 


        
    }

    
}
