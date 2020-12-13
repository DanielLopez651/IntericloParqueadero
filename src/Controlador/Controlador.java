/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class Controlador <E>{
       private List<E> lista;

    public Controlador() {
        lista= new ArrayList();
    }
    public void create(E obj){
        lista.add(obj);
    }

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }
    
       
       
       
    
}
