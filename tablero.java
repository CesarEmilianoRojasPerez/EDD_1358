/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 * @param <T>
 */
public class tablero<T> {
    int ren;
    int col;
    private Adt2D tab;
    
    public tablero(int ren, int col){
        this.ren=ren;
        this.col=col;
        tab=new Adt2D(ren,col);
    }
    
    public void setCasilla(int ren, int col, T dato){
        tab.setElemento(ren, col, dato);
    }
    
    public T getCasilla(int ren, int col){
        return (T) tab.getElemento(ren, col);
    }
    
    @Override
    
    public String toString(){
        return tab.toString();
    }
}
