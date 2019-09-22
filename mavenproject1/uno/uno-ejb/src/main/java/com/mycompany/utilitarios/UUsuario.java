/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utilitarios;

import java.io.Serializable;

/**
 *
 * @author Hernan
 */
public class UUsuario  implements Serializable {
   private int id;
   private int rol;
   private String usuario;
   private String clave;

    public UUsuario() {
    }

    public UUsuario(int id, int rol, String usuario, String clave) {
        this.id = id;
        this.rol = rol;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
   
   
   
}

