/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author USUARIO
 */
public class NodoCp<T> {
    private T dato;
    private NodoCp<T> siguiente;
    private NodoCp<T> anterior;

    public NodoCp() {
    }

    public NodoCp(T dato) {
        this.dato = dato;
    }

    public NodoCp(T dato, NodoCp<T> siguiente, NodoCp<T> anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoCp<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCp<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCp<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCp<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "["+dato+"]\n" ;
    }
    
    
}
