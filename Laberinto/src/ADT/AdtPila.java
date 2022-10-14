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
public class AdtPila<T> {
    NDobleP_L<T> base;
    NDobleP_L<T> top;
    int Tamanio;
    
    public AdtPila(){
        this.base=null;
        this.top=null;
        this.Tamanio=0;
    }
    
    public boolean estaVacia(){
        return this.base == null;
    }
    
    public int Tamanio(){
        NDobleP_L aux = this.base;
        while(aux!= null){
            aux=aux.getSiguiente();
            Tamanio += 1;
        }
        return Tamanio;
    }
    
    public void Pop(){
        if (!this.estaVacia()) {
            NDobleP_L aux = this.base;
            while (aux.getSiguiente().getSiguiente() != null){
                aux = aux.getSiguiente();
                this.top=aux;
                
            }
            aux.setSiguiente(null);
        } else {
            base = null;
        }
    }
    
    public void Push(T valor){
        NDobleP_L nuevo = new NDobleP_L(valor);
        if (this.estaVacia()) {
            this.base = nuevo;
            this.top = nuevo;
        } else {
            NDobleP_L aux = this.base;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            this.top= aux;
        }
        
    }
    
    public T Peek(){
        if(!this.estaVacia()){
            NDobleP_L aux = this.base;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
                this.top=aux;
            }
            return (T) aux.getDato();
        }
        else{
            return null;
        }
    }

    public void ImpPila(){
        NDobleP_L puntero = this.base;
        while(puntero.getSiguiente() != null){
            puntero = puntero.getSiguiente();
        }
        while(puntero!=null){
            System.out.print(puntero);
            puntero = puntero.getAnterior();
        }
        System.out.println("");
    }
}
