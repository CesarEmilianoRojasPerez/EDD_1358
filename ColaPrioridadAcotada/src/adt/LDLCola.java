/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author USUARIO
 * @param <T>
 */
public class LDLCola<T> {
    NodoCp<T> head;
    int Tamanio;
    NodoCp<T> cola;

    public LDLCola() {
        this.head = null;
        this.Tamanio = 0;
        this.cola = null;
    }
    
    public boolean estaVacia() {
        return this.head == null;
    }
    
    public int getTamanio() {
        return Tamanio;
    }

    public void agregarAlFinal(T valor) {
        NodoCp nuevo = new NodoCp(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.cola = nuevo;
            this.Tamanio++;
        } else {
            NodoCp aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            this.cola= aux;
            this.Tamanio++;
        }
    }
    
    public void agregarAlInicio(T valor) {
        NodoCp nuevo = new NodoCp(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.Tamanio++;
        } else {
            nuevo.setSiguiente(this.head);
            this.head.setAnterior(nuevo);
            this.head = nuevo;
            this.Tamanio++;
        }
    }
    
    public void agregarDespuesDe(T valor, int posicion){
        NodoCp nuevo = new NodoCp(valor);
        NodoCp aux = this.head;
        for (int contador = 0; contador <= posicion ; contador++){
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo);
        this.Tamanio++;
    }
    
    public void agregar(T valor, int posicion){
        NodoCp aux = this.head;
        NodoCp nuevo = new NodoCp(valor);
        if(posicion == 1){
            this.agregarAlInicio(valor);
        }else{
            for (int contador = 1; contador < posicion -1; contador++){
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.getSiguiente().setAnterior(nuevo);
            aux.setSiguiente(nuevo);
            this.Tamanio++;
        }
    }
    
    public void eliminar(int posicion){
        NodoCp aux1 = this.head;
        NodoCp aux2 = null;
        for (int contador = 1; contador < posicion - 1; contador++){
            aux1 = aux1.getSiguiente();
        }
        aux2= aux1.getSiguiente().getSiguiente();
        aux1.setSiguiente(aux2);
        aux2.setAnterior(aux1);
        this.Tamanio--;
    }
    
    public void eliminarElPrimero(){
        NodoCp aux = this.head;
        if (!this.estaVacia()){
            this.head = aux.getSiguiente();
            this.head.setAnterior(null);
            this.Tamanio--;
        }
    }
    
    public void eliminarElFinal(){
        if (!this.estaVacia()) {
            NodoCp aux = this.head;
            while (aux.getSiguiente().getSiguiente() != null){
                aux = aux.getSiguiente();
                this.cola=aux;
                
            }
            aux.setSiguiente(null);
            this.Tamanio--;
        } else {
            head = null;
            
        }
    }
    
    public int buscarPosicion(T valor){
        int j=1;
        NodoCp aux = this.head;
        while(aux != null && aux.getDato()!= valor ){
            aux = aux.getSiguiente();
            j +=1;
        }
        return j;
    }
    
    public T buscarValor(int pos){
        NodoCp aux= this.head;
        if(!this.estaVacia()){
            if (pos > this.Tamanio){
                aux=null;
                return (T) aux;
            }else{
                int j =1;
                while(aux.getSiguiente()!=null && j <= pos ){
                    aux=aux.getSiguiente();
                    j++;
                }
            }
            return (T) aux.getDato();
        }else{
            aux=null;
            return (T) aux;
        }
    }
    
    public void actualizar(T a_buscar,T dato ){
        NodoCp aux = this.head;
        if(!this.estaVacia()){
            while(aux != null && aux.getDato()!=a_buscar){
                aux = aux.getSiguiente();
            }
            aux.setDato(dato);
        }
    }
    
    public void actualizarPos(int pos, T dato){
        NodoCp aux=this.head;
        if(!this.estaVacia()){
            int j=1;
            while(j<=pos){
                aux = aux.getSiguiente();
                j++;
            }
            aux.setDato(dato);
        }
    }
    
    public void transversal() {
        NodoCp curr_node = this.head;
        while (curr_node != null) {
            System.out.print(curr_node);
            curr_node = curr_node.getSiguiente();
        }
        System.out.println("");
    }
    
    public void transversalFinal(){
        NodoCp curr_node = this.cola;
        while(curr_node != null){
            System.out.print(curr_node);
            curr_node = curr_node.getAnterior();
        }
        System.out.println("");
    }
}
