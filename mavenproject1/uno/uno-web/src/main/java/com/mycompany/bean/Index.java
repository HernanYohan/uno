/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;

import com.mycompany.interfaces.IUsuario;
import com.mycompany.interfaces.IUsuarioFacade;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import com.mycompany.utilitarios.UUsuario;

/**
 *
 * @author Hernan
 */
@ManagedBean
@SessionScoped
public class Index implements Serializable {

    private String nombre;

    private String clave;

    private UUsuario usu;

    @EJB
    private IUsuarioFacade user;

    public Index() {
        usu = new UUsuario();
    }

    public void iniciarSesion() {

        usu = user.login(nombre, clave);
        if (usu.getUsuario() != null) {
            
            FacesContext facesContext = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
            session.setAttribute("Usuario", usu);

            if(usu.getRol()==1){
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().
                        handleNavigation(FacesContext.getCurrentInstance(), null, "index1.xhtml?faces-redirect=true");
            }else{
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().
                        handleNavigation(FacesContext.getCurrentInstance(), null, "index2.xhtml?faces-redirect=true");
            }
        } else {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "error", "Credenciales incorrectas");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

    }
    
    public void cerrarSesion(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
       session.removeAttribute("Usuario");
        try {
            facesContext.getExternalContext().redirect("index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public UUsuario getUsu() {
        return usu;
    }

    public void setUsu(UUsuario usu) {
        this.usu = usu;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
