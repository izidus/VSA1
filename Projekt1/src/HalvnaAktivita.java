
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import net.useobjects.draw.drawable.GroupView;
import net.useobjects.eventloop.MainActivity;
import net.useobjects.frame.MainWindow;
import net.useobjects.mouse.MouseChangedListener;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izi
 */
public class HalvnaAktivita implements MainActivity  {
    
    

    @Override
    public void onInit() { 
       
           MainWindow hlavneOkno= new MainWindow("aaa", 1500, 800);
           
                hlavneOkno.setVisible(true);
                
                GroupView skrina1 = hlavneOkno.getRootGroup();   
                GroupView skrina2 = hlavneOkno.getRootGroup();   
                  GroupView salkaa = hlavneOkno.getRootGroup();   
                  
            
            
           Skrinka1 skrina= new Skrinka1(skrina1,0,0,0,0);  
           Skrinka2 skrinaa= new Skrinka2(skrina2,0,0,0,0);  
            while(! hlavneOkno.isKeyDown(KeyEvent.VK_ESCAPE)){
                
                 if(hlavneOkno.isKeyDown(KeyEvent.VK_LEFT)){
                
           
           Salka salka=new Salka(salkaa,0,0,0);
                 }
                   if(hlavneOkno.isKeyDown(KeyEvent.VK_U)){
                
           
           Salka salka=new Salka(salkaa,0,0,0);
                 }
                
            }
    
   
}
}