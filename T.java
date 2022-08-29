/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class T {
    private String placas;
    private String color;
    
    public T(String placas, String color){
        this.placas = placas;
        this.color = color;
    }
    @Override
    public String toString(){
        return "Auto{"+"placas:"+placas+",color:"+color+"}";
    }
}
