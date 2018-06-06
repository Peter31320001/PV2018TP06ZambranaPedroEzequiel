/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listamarca;

import java.io.Serializable;
import java.util.ArrayList;
import marca.Marca;

/**
 *
 * @author Ezequiel
 */
public class ListaMarcas implements Serializable{
    private ArrayList <Marca> listaM;

    public ListaMarcas() {
        listaM = new ArrayList();
    }

    public ListaMarcas(ArrayList<Marca> listaM) {
        this.listaM = listaM;
    }

    
    /**
     * @return the listaM
     */
    public ArrayList <Marca> getListaM() {
        return listaM;
    }

    /**
     * @param listaM the listaM to set
     */
    public void setListaM(ArrayList <Marca> listaM) {
        this.listaM = listaM;
    }
    
}
