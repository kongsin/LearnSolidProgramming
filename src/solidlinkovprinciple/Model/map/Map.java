/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Model.map;

import solidlinkovprinciple.Interface.DisplayPoint;
import solidlinkovprinciple.Interface.IMAP;

/**
 *
 * @author kongsin
 */
public abstract class Map implements IMAP {

   public final DisplayPoint[][] map;

    public Map(int mapSize) {
        map = new DisplayPoint[mapSize][mapSize];
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = new MapPointEmpty();
            }
        }
    }
}
