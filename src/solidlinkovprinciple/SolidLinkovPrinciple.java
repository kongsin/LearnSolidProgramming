/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple;

import action.Down;
import action.Left;
import action.Right;
import solidlinkovprinciple.Controller.DisplayController;
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
        duck.displayObject();
        DisplayController dc = new DisplayController();
        dc.initObject(new Right(duck).walk()).diaplay(200);
        dc.initObject(new Right(duck).walk()).diaplay(200);
        dc.initObject(new Down(duck).walk()).diaplay(200);
        dc.initObject(new Down(duck).walk()).diaplay(200);
        dc.initObject(new Down(duck).walk()).diaplay(200);
        dc.initObject(new Right(duck).walk()).diaplay(200);
        dc.initObject(new Right(duck).walk()).diaplay(200);
        dc.initObject(new Down(duck).walk()).diaplay(200);
        dc.initObject(new Down(duck).walk()).diaplay(200);
        dc.initObject(new Left(duck).walk()).diaplay(200);
        dc.initObject(new Left(duck).walk()).diaplay(200);
        dc.initObject(new Left(duck).walk()).diaplay(200);

    }

}
