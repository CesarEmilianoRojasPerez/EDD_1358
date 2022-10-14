/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class ADTLista<T> {
    int tamanio;
    ArrayList<T> datos;
    
    public ADTLista(int tam){
        this.tamanio = tam;
        datos = new ArrayList(this.tamanio);
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.add(null);
        }
    }
    
    private boolean comprobacion(int indice) {
        return indice >= 0 && indice < this.tamanio;
    }

     public T getElemento(int indice) {
        if (comprobacion(indice)) {
            return this.datos.get(indice);
        } else {
            System.out.println("Fuera del rango");
        }
        return null;
    }
    
     public void setElemento(int indice, T dato) {
        if (comprobacion(indice)) {
            this.datos.set(indice, dato);
        } else {
            System.out.println("Fuera del rango");
        }
    }
    
    public int getLongitud() {
        return this.tamanio;
    }
    
    public void limpiar(T dato) {
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.set(i, dato);
        }
    }
    
    @Override
    public String toString(){
        String estado = "";
        for (T dato : datos) {
            if(dato != null){
                estado += "["+dato.toString()+"]";
            }
        }
        return "("+estado + ")";
    }
}
