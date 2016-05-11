/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import solidlinkovprinciple.Interface.IStep;

/**
 *
 * @author kongsin_mac
 */
public class StepController implements IStep{

    @Override
    public int step(int step, int slow) {
        try {
            Thread.sleep(slow);
        } catch (InterruptedException ex) {
            Logger.getLogger(StepController.class.getName()).log(Level.SEVERE, null, ex);
        }
       return step;
    }    
}
