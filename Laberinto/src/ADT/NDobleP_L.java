/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

/**
 *
 * @author USUARIO
 * @param <T>
 */
public class NDobleP_L<T> {
    private T dato;
    private NDobleP_L<T> siguiente;
    private NDobleP_L<T> anterior;
    
    public NDobleP_L(){
    }
    
    public NDobleP_L(T valor) {
        this.dato = valor;
    }

    public NDobleP_L(T dato, NDobleP_L<T> siguiente, NDobleP_L<T> anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    public NDobleP_L<T> getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NDobleP_L<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    public NDobleP_L<T> getAnterior() {
        return anterior;
    }
    
    public void setAnterior(NDobleP_L<T> anterior) {
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
        
        return "<"+dato+"\n";
    }
    
}
