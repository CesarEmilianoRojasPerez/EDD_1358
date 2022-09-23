/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Bienvenido al El juego de la vida \nPrimero que nada, teclea los parametros del tablero \nPrimer Valor:");
        int tab1= t.nextInt();
        System.out.print("Segundo Valor: ");
        int tab2 = t.nextInt();
        System.out.println("");
        inJuego e=new inJuego(tab1,tab2);
        
        System.out.print("Ahora teclea el numero de celulas vivas que quieras: ");
        int I = t.nextInt();
        e.confInicial(I);
        
        System.out.print("Ahora diganos cuantas generaciones quiere checar: ");
        int gen= t.nextInt();
        System.out.println("Gen 0");
        System.out.print(e);
        
        System.out.println("Inicio de la simulacion");
        
        int d = 1;
        while(d <= gen){
            System.out.println("Gen " +d);
            e.siguienteGen();
            System.out.print(e);
            d +=1 ;
        }
    }
}
