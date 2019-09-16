/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.ejb.Local;

/**
 *
 * @author CamiloAlvarez
 */
@Local
public interface IAlgo {
    public int sumar(int n1, int n2);
    
     public int restar(int n1, int n2);
}
