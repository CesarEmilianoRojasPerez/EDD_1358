/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author USUARIO
 */
public class cola<T> {
    NodoC<T> Primero;
    int Tamanio;
    
    public cola(){
        this.Primero=null;
        this.Tamanio=0;
    }
    
    public boolean estaVacia() {
        return this.Primero == null;
    }
    
    public int Tamanio(){
        return Tamanio;
    }
    
    public void enqueue(T dato){
        NodoC<T> nue = new NodoC(dato);
        if(this.estaVacia()){
            this.Primero=nue;
            this.Tamanio=1;
        }else{
            NodoC aux = this.Primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nue);
            this.Tamanio++;
        }
    }
    
    public T dequeue(){
        NodoC aux = this.Primero;
        if (!this.estaVacia()){
            Primero = aux.getSiguiente();
            this.Tamanio--;
        }
        return (T) aux.getDato();
    }
    
    
    @Override
    public String toString() {
        NodoC curr_node = this.Primero;
        String estado=curr_node.toString();
        curr_node=curr_node.getSiguiente();
        while (curr_node != null) {
            estado+=curr_node.toString();
            curr_node = curr_node.getSiguiente();
        }
        return estado;
    }
}
