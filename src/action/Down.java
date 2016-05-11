/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import solidlinkovprinciple.Controller.ActionController;
import solidlinkovprinciple.Model.MyObject;
import solidlinkovprinciple.Interface.IAction;

/**
 *
 * @author kongsin_mac
 */
public class Down extends ActionController implements IAction {

    public Down(MyObject object) {
        super(object);
    }

    @Override
    public MyObject walk() {
        position.x += 1;
        object.setObjectPosition(position);
        return object;
    }

    @Override
    public MyObject run() {
        position.x += 3;
        object.setObjectPosition(position);
        return object;
    }

    @Override
    public MyObject fly() {
        position.x += 5;
        object.setObjectPosition(position);
        return object;
    }

}
