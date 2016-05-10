/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Controller;

import solidlinkovprinciple.Entities.ObjectPosition;
import solidlinkovprinciple.Interface.IDirection;
import solidlinkovprinciple.Model.MyObject;

/**
 *
 * @author kongsin
 */
public class DirectionController implements IDirection {

    private final MyObject object;
    private final int step;

    public DirectionController(MyObject object, int step) {
        this.object = object;
        this.step = step;
    }

    @Override
    public void left() {
        ObjectPosition position = object.getObjectPosition();
        position.y -= step;
        object.displayObject();
    }

    @Override
    public void right() {
        ObjectPosition position = object.getObjectPosition();
        position.y += step;
        object.displayObject();
    }

    @Override
    public void up() {
        ObjectPosition position = object.getObjectPosition();
        position.x -= step;
        object.displayObject();
    }

    @Override
    public void down() {
        ObjectPosition position = object.getObjectPosition();
        position.x += step;
        object.displayObject();
    }

}
