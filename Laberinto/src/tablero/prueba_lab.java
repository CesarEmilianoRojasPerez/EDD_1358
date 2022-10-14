/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablero;
import java.io.File;
/**
 *
 * @author USUARIO
 */
public class prueba_lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File Arch = new File("C:\\Users\\USUARIO\\Desktop\\laberinto.csv");
        Tablero_L Prueba = new Tablero_L(Arch);
        System.out.print(Prueba);
        Prueba.reglas();
        
    }
    
}
