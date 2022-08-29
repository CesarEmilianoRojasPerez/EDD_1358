
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class ADT {
    
    private int tamanio;
    private int tam;
    private int lon;
    private T elementos;
    private ArrayList<T> datos;
    
    public ADT(int tamanio){
        this.tam=tamanio;
        datos = new ArrayList();
        for(int x=0; x<tamanio; x++){
            datos.add((T)new Object());
        }
    }
    
    public void setElementos(T elementos, int indice){
        datos.set(indice, elementos);
    }
    
    public void getLongitud(int lon){
        System.out.println("La longitud del Array es de "+datos.size());
    }
    
    public void getElemento(int indice){
        datos.get(indice);
    }
    
    public void limpiar(){
        datos.clear();
    }
}

