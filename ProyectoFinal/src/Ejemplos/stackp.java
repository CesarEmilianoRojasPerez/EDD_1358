package Ejemplos;

import java.util.Stack;

public class stackp {

    public static void main(String[] args) {
        // Declaración de la pila
        Stack<String> pila1 = new Stack<String>();
        
        
        //Añadiremos nombres a la pila
        pila1.push("Jose");
        pila1.push("Sara");
        pila1.push("Cesar");
        pila1.push("Rodrigo");
        pila1.push("Franco");
        System.out.println("M1");
        System.out.println(pila1);
        System.out.println("");
        
        //Utilicemos Franco para otra cosa y eliminemoslo de la pila
        String nombre=pila1.pop();
        System.out.println("M2");
        System.out.println(nombre+" esta comiendo frijoles");
        System.out.println("");
        
        //Usemos a Rodrigo para otra cosa pero sin sacarlo de la pila
        String nombre2=pila1.peek();
        System.out.println("M3");
        System.out.println(nombre2+" y "+nombre+" juegan a la pelota");
        System.out.println("");
        
        //Ahora consultemos el tamaño
        System.out.println("M4");
        System.out.println(pila1.size());
        System.out.println("");
        
        //Y limpiemosla
        pila1.clear();
        System.out.println("M5");
        System.out.println(pila1);
        System.out.println("");
    }
    
}
