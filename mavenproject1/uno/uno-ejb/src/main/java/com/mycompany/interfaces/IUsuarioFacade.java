/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Usuario;
import com.mycompany.utilitarios.UUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CamiloAlvarez
 */
@Local
public interface IUsuarioFacade {

    void create(Usuario usuario);

    void edit(Usuario usuario);

    void remove(Usuario usuario);
    
    UUsuario login(String usuario,String clave);

    Usuario find(Object id);

    List<Usuario> findAll();

    List<Usuario> findRange(int[] range);

    int count();
    
}
