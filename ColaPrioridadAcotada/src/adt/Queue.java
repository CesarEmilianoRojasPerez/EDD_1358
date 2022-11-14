/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author USUARIO
 */
public class Queue<T> {
    NodoCPA<T> Primero;
    int Tamanio;

    public Queue() {
        this.Primero = null;
        this.Tamanio = 0;
    }
    
    public boolean estaVacia() {
        return this.Primero == null;
    }
    
    public int Tamanio(){
        return Tamanio;
    }
    
    public void enqueue(T dato){
        NodoCPA<T> nue = new NodoCPA(dato);
        if(this.estaVacia()){
            this.Primero=nue;
            this.Tamanio=1;
        }else{
            NodoCPA aux = this.Primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nue);
            this.Tamanio++;
        }
    }
    
    public T dequeue(){
        NodoCPA aux = this.Primero;
        if (!this.estaVacia()){
            Primero = aux.getSiguiente();
            this.Tamanio--;
        }
        return (T) aux.getDato();
    }

    @Override
    public String toString() {
        NodoCPA curr_node = this.Primero;
        String estado=curr_node.toString()+" ";
        curr_node=curr_node.getSiguiente();
        while (curr_node != null) {
            estado+=curr_node.toString()+" ";
            curr_node = curr_node.getSiguiente();
        }
        return estado;
    }
    
    
}
