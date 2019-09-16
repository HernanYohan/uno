/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;

import interfaces.IAlgo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import utilitarios.Usuario;

/**
 *
 * @author CamiloAlvarez
 */
@ManagedBean
@ViewScoped
public class Index1 {

    private int num1;
    private int num2;

    @EJB
    private IAlgo algo;

    public void init() {
        ;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
        Usuario usu = (Usuario) session.getAttribute("Usuario");

        try {
            if (usu.getRol() == 2) {
                FacesContext.getCurrentInstance().getApplication().getNavigationHandler().
                handleNavigation(FacesContext.getCurrentInstance(), null, "index1.xhtml?faces-redirect=true");
            } else {
                if (usu == null) {
                    facesContext.getExternalContext().redirect("index.xhtml");

                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Index1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Index1() {
    }

    public void sumar() {
        int res;
        res = algo.sumar(num1, num2);
        FacesMessage msg = new FacesMessage("Aviso", "Resultado = " + res);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public IAlgo getAlgo() {
        return algo;
    }

    public void setAlgo(IAlgo algo) {
        this.algo = algo;
    }

}
