/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/*
 *
 *@return 
 */
public class Trabajador {

    private int numero_trabajador;
    private String nombre;
    private String paterno;
    private String materno;
    private int horas_extra;
    private double sueldo_base;
    private int anio_ingreso;
    private double Sueldo;

    
    public Trabajador(int nt, String Nom, String Pat, String Mat, int HE, double Suel, int Anio){
        this.numero_trabajador = nt;
        this.nombre = Nom;
        this.paterno = Pat;
        this.materno = Mat;
        this.horas_extra= HE;
        this.sueldo_base = Suel;
        this.anio_ingreso = Anio;
    }
    
    public int get_NumTrabajador(){
        return numero_trabajador;
    }
    
    public void set_NumTrabajador(int nt){
        this.numero_trabajador = nt;
    }
    
    public String get_Nombre(){
        return nombre;
    }
    
    public void set_Nombre(String Nom){
        this.nombre = Nom;
    }

    public String get_Paterno(){
        return paterno;
    }
    
    public void set_Paterno(String Pat){
        this.paterno = Pat;
    } 
    
    public String get_Materno(){
        return materno;
    }
    
    public void set_Materno(String Mat){
        this.materno = Mat;
    } 
    
    public int get_Horas_Extra(){
        return horas_extra;
    }
    
    public void set_Horas_Extra(int HE){
        this.horas_extra = HE;
    }  
    
    public double get_Sueldo_Base(){
        return sueldo_base;
    }
    
    public void set_Sueldo_Base(double Suel){
        this.sueldo_base = Suel;
    }  
    
    public int get_Anio_Ingreso(){
        return anio_ingreso;
    }
    
    public void set_Anio_Ingreso(int Anio){
        this.anio_ingreso = Anio;
    }  
 
    @Override
    public String toString(){
        return "Trabajador{"+"num_trabajador:"+numero_trabajador+", nombre:"+nombre+", ap_paterno:"+paterno+", ap_materno:"+materno+", horas_extra:"+horas_extra+", sueldo_base:"+sueldo_base+", anio_ingreso:"+anio_ingreso+"}";
    }
    
    public double CalcularSueldo() {
        int Ant = 2022 - this.anio_ingreso;
        Sueldo = this.sueldo_base + (this.sueldo_base * (Ant * 0.03)) + this.horas_extra * horas_extra;
        return Sueldo;
    }
}

