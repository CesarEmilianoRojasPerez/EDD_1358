package LLigada;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Prueba_Lista_Ligada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaLigadaADT<Integer> lista = new ListaLigadaADT();
        lista.agregarAlInicio(1);
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(2);
        lista.transversal();
        lista.agregarDespuesDe(10, 2);
        lista.agregarDespuesDe(42, 3);
        lista.transversal();
        System.out.println(lista.buscar(42));
        lista.actualizar(10,40);
        lista.transversal();
        lista.eliminar(3);
        lista.transversal();
        lista.eliminarElPrimero();
        lista.transversal();
        lista.eliminarElFinal();
        lista.transversal();
    }
}
