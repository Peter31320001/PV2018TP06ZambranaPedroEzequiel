/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.io.Serializable;

/**
 *
 * @author Ezequiel
 */
public class Usuario implements Serializable{
    private String usuario;
    private String contraseña;

    public Usuario() {
        
        
    }

    public Usuario(String usurio, String contraseña) {
        this.usuario = usurio;
        this.contraseña = contraseña;
    }

    

    /**
     * @return the usurio
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usurio to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   
    
}
