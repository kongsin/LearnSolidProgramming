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
public class Left extends ActionController{

    public Left(MyObject object) {
        super(object);
    }

    @Override
    public MyObject walk() {
        position.y -= 1;
        object.setObjectPosition(position);
        return object;
    }

    @Override
    public MyObject run() {
        position.y -= 3;
        object.setObjectPosition(position);
        return object;
    }

    @Override
    public MyObject fly() {
        position.y -= 5;
        object.setObjectPosition(position);
        return object;
    }
}
