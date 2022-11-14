/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author USUARIO
 */
public class NodoC<T> {
    private T dato;
    private NodoC<T> siguiente;
    
    public NodoC(){
    }

    public NodoC(T dato) {
        this.dato = dato;
    }
    
    public NodoC(T dato, NodoC<T> siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoC<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoC<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "<|"+dato+"\n";
    }
    
    
}
