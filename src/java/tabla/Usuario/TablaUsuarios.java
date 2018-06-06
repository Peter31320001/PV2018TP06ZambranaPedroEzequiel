package tabla.Usuario;


import java.util.ArrayList;
import usuario.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ezequiel
 */
public class TablaUsuarios {
    
    private ArrayList <Usuario> usuarios;
    

    
    /**
     * Creates a new instance of TablaUsuario
     */
    public TablaUsuarios() {
        usuarios = new ArrayList();
        usuarios.add(new Usuario("nuevo", "nuevo"));
        usuarios.add(new Usuario("admin", "admin"));
    }
    public Usuario validarUsuario(String usuario, String contraseña){
        Usuario usu = null;
        for(Usuario u : getUsuarios()){
            if(u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)){
                usu = u;
                break;
            }
        }
            return usu;
    }

    /**
     * @return the usuarios
     */
    public ArrayList <Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(ArrayList <Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
