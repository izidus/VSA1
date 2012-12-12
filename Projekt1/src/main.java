

import net.useobjects.eventloop.EventLoop;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izi
 */
public class main  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
                    
   EventLoop eventLoop = EventLoop.getInstance();
   
   eventLoop.start(new HalvnaAktivita());

    }
    
}
