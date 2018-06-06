/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.electrodomestico;

import electrodomestico.Eletrodomestico;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ezequiel
 */
public class ListaElectrodomestico implements Serializable{
    private ArrayList <Eletrodomestico> listaE;

    public ListaElectrodomestico() {
        listaE = new ArrayList();
    }
    public ArrayList<Eletrodomestico> agregarElectrodomestico (Eletrodomestico eletrodomestico){
        getListaE().add(eletrodomestico);
        return getListaE();
    }
    public ArrayList<Eletrodomestico> modificarElectrodomestico(Eletrodomestico unElectrodomestico){
        for(Eletrodomestico e:listaE){
            if(e.getCodigo().equals(unElectrodomestico.getCodigo())){
                if(unElectrodomestico.getStock()==0){
                    unElectrodomestico.setDisponibilidad(false);
                    listaE.set(listaE.indexOf(e), unElectrodomestico);
                }
                else{
                    listaE.set(listaE.indexOf(e), unElectrodomestico);                  
                }
                break;
            }
        }
        return listaE;
    }

    public ArrayList<Eletrodomestico> eliminarElectrodomestico(Eletrodomestico unElectrodomestico){
        for(Eletrodomestico e:listaE){
            if(e.getCodigo().equals(unElectrodomestico.getCodigo())){
                listaE.remove(listaE.indexOf(e));
                break;
            }
        }
        return listaE;
    }

    public ListaElectrodomestico(ArrayList<Eletrodomestico> listaE) {
        this.listaE = listaE;
    }

    
    /**
     * @return the listaE
     */
    public ArrayList <Eletrodomestico> getListaE() {
        return listaE;
    }

    /**
     * @param listaE the listaE to set
     */
    public void setListaE(ArrayList <Eletrodomestico> listaE) {
        this.listaE = listaE;
    }
    
    
}
