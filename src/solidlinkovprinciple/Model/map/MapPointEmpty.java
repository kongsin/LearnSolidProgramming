/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Model.map;

import solidlinkovprinciple.Interface.DisplayPoint;

/**
 *
 * @author kongsin
 */
public class MapPointEmpty implements DisplayPoint{

    @Override
    public String show() {
        System.out.print("[ ]");
        return "[ ]";
    }
    
}
