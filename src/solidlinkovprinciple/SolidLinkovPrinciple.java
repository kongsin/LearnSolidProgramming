/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple;

import solidlinkovprinciple.Model.Duck;
import solidlinkovprinciple.Model.map.Map;

/**
 *
 * @author kongsin
 */
public class SolidLinkovPrinciple {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Map map = new Map(20);
        Duck duck = new Duck("100", "my duct", 0, 0, map);
        duck.walk().right();
        Thread.sleep(400);
        duck.walk().right();
        Thread.sleep(400);
        duck.run().down();
        Thread.sleep(400);
        duck.walk().down();
        Thread.sleep(400);
        duck.fly().right();
        Thread.sleep(400);
    }

}
