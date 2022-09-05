/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import java.io.File;

/**
 *
 * @author USUARIO
 */
public class Empresa {

    public static void main(String[] args) throws Exception{
        File Arch = new File("C:\\Users\\USUARIO\\Desktop\\junio.dat");
        Nomina Prueba = new Nomina(Arch);
        Prueba.listar_sueldos();
        Prueba.mayor_antigueadad(); //Da como resultado el primer trabajador y el de mayor antiguedad
    }
}
    

