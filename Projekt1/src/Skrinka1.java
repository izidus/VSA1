
import java.awt.Color;
import net.useobjects.draw.drawable.GroupView;
import net.useobjects.draw.drawable.LineView;
import net.useobjects.draw.drawable.RectangleView;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izi
 */
public class Skrinka1 {
    
    private RectangleView StvorecVon;
     private RectangleView StvorecDnu;
     
     private RectangleView Polica;
       private RectangleView Polica2;
   
      
       
       
      public Skrinka1(GroupView Skrinka1,int poziciaX,int poziciaY,int sirka,int dlzka){
           
           
           StvorecVon=new RectangleView(Skrinka1,400,400,600,400);
              StvorecDnu=new RectangleView(Skrinka1,400,400,590 ,390);        
         
                  StvorecDnu.setColor(Color.yellow);                  
                 
          Polica=new RectangleView(Skri           
nka1,400,400,600,5); 
           Polica2=new RectangleView(Skrinka1,2,10,500,5);
       
       
       
       } 
      
     
    
    
}
