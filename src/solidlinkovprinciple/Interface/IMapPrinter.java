/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Interface;

import javax.swing.JTextArea;
import solidlinkovprinciple.Model.MyObject;

/**
 *
 * @author kongsin_mac
 */
public interface IMapPrinter {
    void clearVirsualMap(JTextArea label);
    void getVirsualMap(JTextArea label, MyObject obj);
}
