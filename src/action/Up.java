/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import solidlinkovprinciple.Controller.ActionController;
import solidlinkovprinciple.Model.MyObject;

/**
 *
 * @author kongsin_mac
 */
public class Up extends ActionController{

    public Up(MyObject object) {
        super(object);
    }

    @Override
    public MyObject walk() {
        position.x -= 1;
        object.setObjectPosition(position);
        return object;
    }

    @Override
    public MyObject run() {
        position.x -= 3;
        object.setObjectPosition(position);
        return object;
    }

    @Override
    public MyObject fly() {
        position.x -= 5;
        object.setObjectPosition(position);
        return object;
    }
    
}
