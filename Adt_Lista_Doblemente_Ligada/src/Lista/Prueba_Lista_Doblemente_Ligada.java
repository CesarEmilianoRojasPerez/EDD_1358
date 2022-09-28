/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lista;

/**
 *
 * @author USUARIO
 */
public class Prueba_Lista_Doblemente_Ligada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LDobleLig<Integer> j = new LDobleLig();
        j.agregarAlFinal(100);
        j.agregarAlFinal(50);
        j.agregarAlFinal(5);
        j.agregarAlFinal(56);
        j.agregarAlFinal(80);
        j.transversal();
        j.agregarAlInicio(12);
        j.transversal();
        j.agregarDespuesDe(7,2);
        j.transversal();
        j.eliminar(3);
        j.transversal();
        j.eliminarElPrimero();
        j.transversal();
        j.eliminarElFinal();
        j.transversal();
        System.out.println(j.buscar(56));
        j.actualizar(50, 8);
        j.transversal();
        j.agregarDespuesDe(8, 3);
        j.transversalFinal();
    }
}
    

