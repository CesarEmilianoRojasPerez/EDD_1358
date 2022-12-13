package Ejemplos;

import java.util.LinkedList;

public class LinLis {

    public static void main(String[] args) {
        
        //Contrimos la lista ligada
        LinkedList<Integer> numeros=new LinkedList();
        
        //Aqui añadiremos el 5,6,7 y 8 en la lista
        int x=5;
        while(x<=8){
            numeros.add(x);
            x++;
        }
        System.out.println("M1");
        System.out.println(numeros);
        System.out.println("");
        
        //Añadiremos el 1,2,3 y 4 al principio de la lista
        int y=4;
        int s=y;
        while (y!=0){
            numeros.addFirst(y);
            y--;
        }
        System.out.println("M2");
        System.out.println(numeros);
        System.out.println("");
        
        //Y añadiremos el 9,10,11,12 y 13 al final
        int w=9;
        while (w<=12){
            numeros.addLast(w);
            w++;
        }
        numeros.addLast(13);
        System.out.println("M3");
        System.out.println(numeros);
        System.out.println("");
        
        //Obtendremos los valores de tamaño de la lista
        int d= numeros.size();
        System.out.println("M4");
        System.out.println(d);
        System.out.println("");
        
        //Ahora elminaremos el 1,4,8,12 y 13;
        numeros.removeFirst();//para 1
        numeros.remove(s-2);//para 4
        numeros.remove(x-4);//para 8
        numeros.remove(w-4);//para 12
        numeros.removeLast();//para 13
        System.out.println("M5");
        System.out.println(numeros);
        System.out.println("");
    }
    
    
}
