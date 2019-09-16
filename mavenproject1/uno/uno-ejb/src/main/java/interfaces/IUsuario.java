/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.ejb.Local;
import utilitarios.Usuario;

/**
 *
 * @author Hernan
 */
@Local
public interface IUsuario {
     
    public Usuario loggin(String Nombre,String Clave);
    
    public void cerrarSesion();
    
}
