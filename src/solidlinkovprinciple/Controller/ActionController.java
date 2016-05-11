/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Controller;

import solidlinkovprinciple.Entities.ObjectPosition;
import solidlinkovprinciple.Model.MyObject;
import solidlinkovprinciple.Interface.IAction;

/**
 *
 * @author kongsin_mac
 */
public abstract class ActionController implements IAction {

    protected final MyObject object;
    protected final ObjectPosition position;


    public ActionController(MyObject object) {
        this.object = object;
        position = object.getObjectPosition();
    }
}
