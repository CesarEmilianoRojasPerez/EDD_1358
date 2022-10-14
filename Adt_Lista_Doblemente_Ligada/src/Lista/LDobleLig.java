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
public class LDobleLig<T> {
    NDoble<T> head;
    int Tamanio;
    NDoble<T> cola;

    public LDobleLig() {
        this.head = null;
        this.Tamanio = 0;
        this.cola = null;
    }
    
    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        NDoble aux=this.head;
        while(aux!= null){
            aux.getSiguiente();
            Tamanio +=1 ;
        }
        return Tamanio;
    }

    public void agregarAlFinal(T valor) {
        NDoble nuevo = new NDoble(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.cola = nuevo;
        } else {
            NDoble aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            this.cola= aux;
        }
    }
    
    public void agregarAlInicio(T valor) {
        NDoble nuevo = new NDoble(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            nuevo.setSiguiente(this.head);
            this.head.setAnterior(nuevo);
            this.head = nuevo;
        }
    }
    
    public void agregarDespuesDe(T valor, int posicion){
        NDoble nuevo = new NDoble(valor);
        NDoble aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++){
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo);
    }
    
    public void eliminar(int posicion){
        NDoble aux1 = this.head;
        NDoble aux2 = null;
        for (int contador = 1; contador < posicion - 1; contador++){
            aux1 = aux1.getSiguiente();
        }
        aux2= aux1.getSiguiente().getSiguiente();
        aux1.setSiguiente(aux2);
        aux2.setAnterior(aux1);
    }
    
    public void eliminarElPrimero(){
        NDoble aux = this.head;
        if (!this.estaVacia()){
            this.head = aux.getSiguiente();
            this.head.setAnterior(null);
        }
    }
    
    public void eliminarElFinal(){
        if (!this.estaVacia()) {
            NDoble aux = this.head;
            while (aux.getSiguiente().getSiguiente() != null){
                aux = aux.getSiguiente();
                this.cola=aux;
                
            }
            aux.setSiguiente(null);
        } else {
            head = null;
        }
    }
    
    public int buscar(T valor){
        int j=1;
        NDoble aux = this.head;
        while(aux != null && aux.getDato()!= valor ){
            aux = aux.getSiguiente();
            j +=1;
        }
        return j;
    }
    
    public void actualizar(T a_buscar,T dato ){
        NDoble aux = this.head;
        if(!this.estaVacia()){
            while(aux != null && aux.getDato()!=a_buscar){
                aux = aux.getSiguiente();
            }
            aux.setDato(dato);
        }
    }
    
    public void posicion(int pos){
        NDoble aux = this.head;
        if(!this.estaVacia()){
            for (int contador = 1; contador < pos; contador++){
                aux=aux.getSiguiente();
            }
            System.out.println("Posicion: "+pos+"\tDato: "+aux.getDato());
        }
    }
    
     public void posicionInicial(){
        NDoble aux = this.head;
        int h = 1;
        if(!this.estaVacia()){
            System.out.println("Posicion: "+h+"\tDato: "+aux.getDato());
        }
    }
    
    public void posicionFinal(){
        NDoble aux1 = this.cola;
        NDoble aux2 = this.head;
        if(!this.estaVacia()){
            int h=1;
            while (aux2.getSiguiente().getSiguiente() != null){
                aux2 = aux2.getSiguiente();
                h +=1;
            }
            System.out.println("Posicion: "+h+"\tDato: "+aux1.getDato());
        }
    }
    
    public void transversal() {
        NDoble curr_node = this.head;
        while (curr_node != null) {
            System.out.print(curr_node);
            curr_node = curr_node.getSiguiente();
        }
        System.out.println("");
    }
    
    public void transversalFinal(){
        NDoble curr_node = this.cola;
        while(curr_node != null){
            System.out.print(curr_node);
            curr_node = curr_node.getAnterior();
        }
        System.out.println("");
    }
}
