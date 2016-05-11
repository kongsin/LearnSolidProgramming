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
public interface IAction {

    MyObject walk();

    MyObject run();

    MyObject fly();
}
