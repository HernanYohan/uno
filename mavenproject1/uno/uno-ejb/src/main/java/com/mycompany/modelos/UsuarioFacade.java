/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelos;

import com.mycompany.interfaces.IUsuarioFacade;
import com.mycompany.entity.Usuario;
import com.mycompany.utilitarios.UUsuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author CamiloAlvarez
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements IUsuarioFacade {
    @PersistenceContext(unitName = "persistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public UUsuario login(String usuario, String clave) {
                UUsuario user=null;
        Usuario us=null;
        try{
            Query login = em.createQuery("FROM Usuario u WHERE u.usuario = ?1 and u.clave = ?2");
            login.setParameter(1, usuario);
            login.setParameter(2, clave);
            
            List<Usuario> lista = login.getResultList();
            if(!lista.isEmpty()){
                us = lista.get(0);
                user = new UUsuario(us.getId(), us.getRol(), us.getUsuario(), us.getClave());
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return user;
    }
    
}
