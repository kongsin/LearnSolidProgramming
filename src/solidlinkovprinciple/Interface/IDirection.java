/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Interface;

import solidlinkovprinciple.Model.MyObject;

/**
 *
 * @author kongsin
 */
public interface IDirection {

    MyObject left();

    MyObject right();

    MyObject up();

    MyObject down();
}
