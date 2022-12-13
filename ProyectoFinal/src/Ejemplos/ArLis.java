package Ejemplos;

import java.util.ArrayList;

public class ArLis {

    public static void main(String[] args) {

        //Declaración del Array List
        ArrayList<Integer> cuenta = new ArrayList<Integer>();
        
        //Pondremos la tabla del 9
        //con la funcion add
        System.out.println("Tabla del 9");
        int x=9;
        while(x<=90){
            cuenta.add(x);
            x = x + 9;
        }
        System.out.println(cuenta);
        
        //Ahora, agregaremos el resultado de 9*11 y 9*12
        cuenta.add(99);
        cuenta.add(100);
        System.out.println(cuenta);
        System.out.println("");
        
        //Tendremos que retirar el 100 porque no es el resultado de 9*12
        cuenta.remove(11);
        cuenta.add(11, 108);
        System.out.println(cuenta);
        System.out.println("");
        
        //Chequemos si el tamaño de la lista es efectivamente de 12
        if(cuenta.size()==12){
            System.out.println("True "+cuenta.get(11));
            //si el tamaño es de 12, se regresara el elemento
            //de la ultima posición
        }
        System.out.println("");
        
        //Ahora limpiemos la lista y pongamos la tabla del 5
        cuenta.clear();//Asi evitamos usar remove 12 veces
        int y=5;
        int i=1;
        while(i<=10){
            cuenta.add(i*y);
            i++;
        }
        System.out.println("Tabla del 5");
        System.out.println(cuenta);
        System.out.println("");
    }
    
}
