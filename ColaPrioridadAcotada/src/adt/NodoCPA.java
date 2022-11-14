/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author USUARIO
 */
public class NodoCPA<T> {
    private T dato;
    private NodoCPA<T> siguiente;

    public NodoCPA() {
    }

    public NodoCPA(T dato) {
        this.dato = dato;
    }

    public NodoCPA(T dato, NodoCPA<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoCPA<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCPA<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "<|"+dato;
    }
}
