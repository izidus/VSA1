
import java.awt.Color;
import java.awt.event.KeyEvent;

import net.useobjects.draw.drawable.CircleView;
import net.useobjects.draw.drawable.GroupView;
import net.useobjects.draw.drawable.RectangleView;
import net.useobjects.draw.drawable.TextView;
import net.useobjects.frame.MainWindow;
import net.useobjects.geom.Position;

import net.useobjects.mouse.MouseChangedEvent;
import net.useobjects.mouse.MouseChangedListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izi
 */
public class Salka {
    
    private RectangleView SalkaTelo;
    private CircleView SalkaUcho;          
    
     
        
          public Salka(GroupView salka, double poziciaX, double poziciaY ,double polomer){
           
               SalkaTelo= new RectangleView(salka,40,50,60,80); 
                  SalkaUcho=  new CircleView(salka,69,50,20);  
          
           }
       
            
            
         

}