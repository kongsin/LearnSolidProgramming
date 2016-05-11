/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import solidlinkovprinciple.Interface.IDisplay;
import solidlinkovprinciple.Model.MyObject;

/**
 *
 * @author kongsin_mac
 */
public class DisplayController implements IDisplay{
    private MyObject myObject;

    public DisplayController initObject(MyObject object){
            this.myObject = object;
            return this;
    }

    @Override
    public void diaplay(int delay) {
        try {
            Thread.sleep(delay);
            myObject.displayObject();
        } catch (InterruptedException ex) {
            Logger.getLogger(DisplayController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
