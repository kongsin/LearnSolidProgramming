/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Model.map;

import solidlinkovprinciple.Interface.DisplayPoint;
import solidlinkovprinciple.Model.MyObject;

/**
 *
 * @author kongsin_mac
 */
public class ConsoldMap extends Map {

    public ConsoldMap(int mapSize) {
        super(mapSize);
    }

    @Override
    public void clearMap() {
        super.clearMap();
        System.out.println("\n\n\n\n\n\n\n\n");
    }

    @Override
    public void displayMap(MyObject object) {
        clearMap();
        map[object.getObjectPosition().x][object.getObjectPosition().y] = new MapPointPined();
        for (DisplayPoint[] i : map) {
            for (DisplayPoint j : i) {
                j.show();
            }
            System.out.println("");
        }
    }

}
