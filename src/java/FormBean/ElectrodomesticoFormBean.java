/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormBean;

import electrodomestico.Eletrodomestico;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import lista.electrodomestico.ListaElectrodomestico;
import listamarca.ListaMarcas;
import marca.Marca;

/**
 *
 * @author Ezequiel
 */
@ManagedBean
@ViewScoped
public class ElectrodomesticoFormBean implements Serializable{
    private String codigo;
    private String tipo;
    private Marca marca;
    private Date fecha;
    private Eletrodomestico unEletrodomestico;
    private ListaElectrodomestico electrodomesticos;
    private ArrayList <Eletrodomestico> lista;
    private ListaMarcas listadoM;
    private ArrayList <Marca> listaMarcas;
    private String modelo;
    private int precio;
    private int stock;
    private String imagen;
    private boolean disponibilidad;
    

    /**
     * Creates a new instance of ElectrodomesticoFormBean
     */
    public ElectrodomesticoFormBean() {
        electrodomesticos = new ListaElectrodomestico();
        lista = new ArrayList();
        listadoM = new ListaMarcas();
        listadoM.getListaM().add(new Marca("l","HP"));
        listadoM.getListaM().add(new Marca("2","Sony"));
        listadoM.getListaM().add(new Marca("3","Acer"));
        listadoM.getListaM().add(new Marca("4","Lenovo"));
        listadoM.getListaM().add(new Marca("5","LG"));
    }
    public void agregarElectrodomestico()throws ParseException{
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //Date unafecha = formato.parse(getFecha());
        if(getStock()>0){
            setDisponibilidad(true);
        }
        else{
            setDisponibilidad(false);
        }
        unEletrodomestico = new Eletrodomestico(getCodigo(),getTipo(),getMarca(),getFecha(),getModelo(),getPrecio(),getStock(),getImagen(),disponibilidad);
        lista = getListaElectrodomesticos().agregarElectrodomestico(unEletrodomestico);
    }
    public void establecerElectrodomestico(Eletrodomestico unElectrodomestico){
        setUnEletrodomestico(unElectrodomestico);
    }
    public void modificarElectrodomesticos(){
        setLista(electrodomesticos.modificarElectrodomestico(unEletrodomestico));
    }
    
    public void eliminarElectrodomestico(){
        setLista(electrodomesticos.eliminarElectrodomestico(unEletrodomestico));

    }
    
    public void limpiarLista(){
        lista=new ArrayList();
        electrodomesticos=new ListaElectrodomestico();
    }
    

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the unEletrodomestico
     */
    public Eletrodomestico getUnEletrodomestico() {
        return unEletrodomestico;
    }

    /**
     * @param unEletrodomestico the unEletrodomestico to set
     */
    public void setUnEletrodomestico(Eletrodomestico unEletrodomestico) {
        this.unEletrodomestico = unEletrodomestico;
    }

    /**
     * @return the listaElectrodomesticos
     */
    public ListaElectrodomestico getListaElectrodomesticos() {
        return electrodomesticos;
    }

    /**
     * @param listaElectrodomesticos the listaElectrodomesticos to set
     */
    public void setListaElectrodomesticos(ListaElectrodomestico listaElectrodomesticos) {
        this.electrodomesticos = listaElectrodomesticos;
    }

    /**
     * @return the lista
     */
    public ArrayList <Eletrodomestico> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList <Eletrodomestico> lista) {
        this.lista = lista;
    }

    /**
     * @return the listadoM
     */
    public ListaMarcas getListadoM() {
        return listadoM;
    }

    /**
     * @param listadoM the listadoM to set
     */
    public void setListadoM(ListaMarcas listadoM) {
        this.listadoM = listadoM;
    }

    /**
     * @return the listaMarcas
     */
    public ArrayList <Marca> getListaMarcas() {
        return listaMarcas;
    }

    /**
     * @param listaMarcas the listaMarcas to set
     */
    public void setListaMarcas(ArrayList <Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the disponibilidad
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
