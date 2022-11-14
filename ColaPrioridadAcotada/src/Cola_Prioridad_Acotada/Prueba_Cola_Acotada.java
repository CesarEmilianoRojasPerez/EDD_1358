/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cola_Prioridad_Acotada;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Prueba_Cola_Acotada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Atencion capitan, el barco ocupa saber cual es el orden de abandono para los tripulantes");
        System.out.print("Para ello, ocupamos saber cuantos cargos o tipo de tripulantes: ");
        Scanner a=new Scanner(System.in);
        int b = a.nextInt();
        BoundedPriorityQueue<Tripulante> u= new BoundedPriorityQueue(b);
        int x=0;
        System.out.println("Ahora, vaya ingresando la ocupacion y la prioridad de los tripulantes");
        while(x!=1){
            Tripulante aux=new Tripulante();
            Scanner t = new Scanner(System.in);
            Scanner y=new Scanner(System.in);
            Scanner r=new Scanner(System.in);
            System.out.print("Ocupacion: ");
            String c=t.nextLine();
            System.out.print("Prioridad: ");
            int d=y.nextInt();
            aux.setOcupacion(c);
            aux.setPrioridad(d);
            u.enqueue(aux.getPrioridad(), aux);
            aux=null;
            System.out.print("(Pulse 1 para indicar que son todos los pasajeros a bordo)");
            x=r.nextInt();
        }
        System.out.println("Entonces capitan, le muestro la lista de abandono en caso de necesitarla");
        u.String();
        System.out.println("Eso es todo capitan, buen viaje");
    }
    
}
