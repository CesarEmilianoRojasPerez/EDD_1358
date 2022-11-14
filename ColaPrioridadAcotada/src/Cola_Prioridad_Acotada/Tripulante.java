/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola_Prioridad_Acotada;

/**
 *
 * @author USUARIO
 */
public class Tripulante {
    private String ocupacion;
    private int prioridad;

    public Tripulante() {
    }

    public Tripulante(String ocupacion, int prioridad) {
        this.ocupacion = ocupacion;
        this.prioridad = prioridad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return ocupacion;
    }
    
    
}
