/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Model.map;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import solidlinkovprinciple.Interface.DisplayPoint;
import solidlinkovprinciple.Interface.IMAP;
import solidlinkovprinciple.Interface.IMapPrinter;
import solidlinkovprinciple.Model.MyObject;

/**
 *
 * @author kongsin_mac
 */
public class GUIMap extends Map implements IMAP {

    public JTextArea lArea;

    public GUIMap(int mapSize, JTextArea laArea) {
        super(mapSize);
        this.lArea = laArea;
    }

    @Override
    public void clearMap() {
        lArea.setText("");
        for (DisplayPoint[] map1 : map) {
            for (int j = 0; j < map1.length; j++) {
                map1[j] = new MapPointEmpty();
            }
        }
    }

    @Override
    public void displayMap(MyObject object) {
        clearMap();
        String val = "";
        map[object.getObjectPosition().x][object.getObjectPosition().y] = new MapPointPined();
        for (DisplayPoint[] i : map) {
            for (DisplayPoint j : i) {
                val += j.show();
            }
            val += "\n";
        }
        lArea.setText(val);
    }

}