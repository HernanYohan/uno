/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos;

import com.mycompany.interfaces.IAlgo;
import javax.ejb.Stateful;

/**
 *
 * @author CamiloAlvarez
 */
@Stateful
public class AlgoModelo implements IAlgo{

    @Override
    public int sumar(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int restar(int n1, int n2) {
         return n1*n2;
    }
    
    
}
