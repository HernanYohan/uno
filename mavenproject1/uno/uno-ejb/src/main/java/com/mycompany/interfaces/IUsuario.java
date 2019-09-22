/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import javax.ejb.Local;
import com.mycompany.utilitarios.UUsuario;

/**
 *
 * @author Hernan
 */
@Local
public interface IUsuario {
     
    public UUsuario loggin(String Nombre,String Clave);
    
    public void cerrarSesion();
    
}
