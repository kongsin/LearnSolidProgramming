/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Model;

import solidlinkovprinciple.Controller.DirectionController;
import solidlinkovprinciple.Entities.ObjectPosition;
import solidlinkovprinciple.Interface.IDuck;
import solidlinkovprinciple.Model.map.Map;

/**
 *
 * @author kongsin
 */
public class Duck extends MyObject implements IDuck {

    public Duck(String ObjectId, String ObjectName, int startX, int startY, Map map) {
        super(ObjectId, ObjectName, startX, startY, map);
    }

    @Override
    public DirectionController walk() {
        return new DirectionController(this, 1);
    }

    @Override
    public DirectionController run() {
        return new DirectionController(this, 3);
    }

    @Override
    public DirectionController fly() {
        return new DirectionController(this, 5);
    }
}
