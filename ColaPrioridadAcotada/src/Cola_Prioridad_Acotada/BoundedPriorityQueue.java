/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola_Prioridad_Acotada;
import adt.LDLCola;
import adt.Queue;
import adt.NodoCp;
/**
 *
 * @author USUARIO
 */
public class BoundedPriorityQueue<T> {
    private LDLCola<Queue> nivel;
    private int Tamanio;
    private NodoCp<T> dato;
    
    public BoundedPriorityQueue(int niveles) {
        this.Tamanio = niveles;
        this.nivel= new LDLCola();
        this.dato=new NodoCp();
        Queue aux= new Queue();
        aux=null;
        for (int i = 0; i < this.Tamanio; i++) {
            this.nivel.agregarAlFinal(aux);
        }
    }
    
    public int Tamanio(){
        return Tamanio;
    }
    
    public void enqueue(int prioridad, T valor){
        if(nivel.buscarValor(prioridad)==null){
            Queue aux=new Queue();
            aux.enqueue(valor);
            nivel.actualizarPos(prioridad, aux);
            aux=null;
        } else{
            Queue aux=nivel.buscarValor(prioridad);
            aux.enqueue(valor);
            nivel.actualizarPos(prioridad, aux);
            aux=null;
        }
    }
    
    public T dequeue(){
        int j=0;
        Queue aux=new Queue();
        if(nivel.buscarValor(j).Tamanio()==1){
            aux=nivel.buscarValor(j);
            this.dato.setDato((T)aux.dequeue());
            nivel.eliminarElPrimero();
            aux=null;
            nivel.agregarAlFinal(aux);
        }else{
            aux=nivel.buscarValor(j);
            this.dato.setDato((T)aux.dequeue());
            nivel.actualizarPos(j, aux);
        }
        return (T) this.dato;
    }
    
    public void String(){
        nivel.transversal();
    }
}
