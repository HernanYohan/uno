/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import utilitarios.Usuario;

/**
 *
 * @author Hernan
 */
@Stateless
public class UsuarioModelo implements interfaces.IUsuario{
    
    List <Usuario> listaUsuarios = new ArrayList<>(); 

    public UsuarioModelo() {
        listaUsuarios.add(new Usuario("Hernan", "21", 1));
        listaUsuarios.add(new Usuario("Camilo", "777", 1));
        listaUsuarios.add(new Usuario("Admin", "Admin", 2));
    }
    
    
    
    @Override
    public Usuario loggin(String Clave, String Nombre) {
        Usuario user = new Usuario();
        for  (Usuario nuevo : listaUsuarios) {
              if (nuevo.getNombre().equals(Nombre) && nuevo.getClave().equals(Clave) )  {
                  user=nuevo;
              } 
            }
        return user;
    }
            
    @Override
    public void cerrarSesion() {
    
    }
    
    
}
