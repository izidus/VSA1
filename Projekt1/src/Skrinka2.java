
import java.awt.Color;
import net.useobjects.draw.drawable.GroupView;
import net.useobjects.draw.drawable.RectangleView;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izi
 */
public class Skrinka2 {
    
      
    private RectangleView StvorecVon;
     private RectangleView StvorecDnu;
      
       private RectangleView Polica2;
       
      public Skrinka2(GroupView Skrinka2,int poziciaX,int poziciaY,int sirka,int dlzka){
           
           
           StvorecVon=new RectangleView(Skrinka2,1050,400,600,400);
              StvorecDnu=new RectangleView(Skrinka2,1050,400,590 ,390);         
         
                  StvorecDnu.setColor(Color.pink);  
       
       Polica2=new RectangleView(Skrinka2,1050,400,600,5); 
       
       } 
    
    
    
}
