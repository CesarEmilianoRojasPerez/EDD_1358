/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author USUARIO
 * @param <T>
 */
public class NDoble<T> {
    private T dato;
    private NDoble<T> siguiente;
    private NDoble<T> anterior;

    public NDoble(){
    }
    
    public NDoble(T valor) {
        this.dato = valor;
    }

    public NDoble(T dato, NDoble<T> siguiente, NDoble<T> anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    public NDoble<T> getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NDoble<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    public NDoble<T> getAnterior() {
        return anterior;
    }
    
    public void setAnterior(NDoble<T> anterior) {
        this.anterior = anterior;
    }
    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        
        return "--<|"+dato+"|>--";
    }
}
