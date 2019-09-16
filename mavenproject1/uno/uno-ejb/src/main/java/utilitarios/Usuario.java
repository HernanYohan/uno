/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.io.Serializable;

/**
 *
 * @author Hernan
 */
public class Usuario  implements Serializable {
    
    /**
     * Variable que guarda la cedula
     */
    
    private String clave;
    
    /**
     * Variable que muestra el nimebre 
     */
 
    private String nombre;
    
    private int rol;
    
    

    public Usuario() {
    }

    public Usuario(String clave, String nombre, int rol) {
        this.clave = clave;
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    
 
  



}

