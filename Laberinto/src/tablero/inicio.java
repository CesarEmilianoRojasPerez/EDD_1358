/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import java.util.Scanner;
import java.io.File;
/**
 *
 * @author USUARIO
 */
public class inicio {
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public inicio(){
        System.out.println("Bienvenido, este programa le da la solucion a cualquier laberinto que tenga"
                + "Antes de empezar, asegurese de que haya introducido los datos en el archivo " +ANSI_PURPLE+ "laberinto.csv"+ANSI_RESET+" de la siguiente forma"
                + "Los dos primeros renglones seran las dimensiones del laberinto"
                + "Despues haga una representación del laberinto respetando cada pasillo y muro de manera correcta"
                + "Al final, en las siguientes dos lineas dejara las coordenadas de inicio y salida, donde Y va en el primer recuadro y X en el segundo");
        File Arch = new File("C:\\Users\\USUARIO\\Desktop\\laberinto.csv");
        Tablero_L laberinto = new Tablero_L(Arch);
        Scanner t = new Scanner(System.in);
        System.out.print("Si esta seguro, pulse cero para continuar: ");
        int b = t.nextInt();
        while (b!=0){
            System.out.println("Valor no aceptado intente de nuevo\n\n");
            System.out.print("Si esta seguro, pulse cero para continuar: ");
            b = t.nextInt();
        }
        Scanner r= new Scanner(System.in);
        Scanner d= new Scanner(System.in);
        int a=1;
        System.out.print(laberinto);
        System.out.print("¿Es correcto su laberinto?\nPulse 0 para confirmar");
        a=r.nextInt();
        if (a!=0){
            while (a!=0){
                System.out.print("Si coloco mal la entrada y la salida del laberinto, pulse 1, de lo contrario pulse 2:");
                int c= d.nextInt();
                if (c==1){
                    Scanner j= new Scanner(System.in);
                    Scanner k= new Scanner(System.in);
                    Scanner l= new Scanner(System.in);
                    Scanner o= new Scanner(System.in);
                    System.out.println("Coloque las coordenadas de inicio");
                    System.out.print("Eje x: ");
                    int x1=j.nextInt();
                    System.out.print("Eje y: ");
                    int y1=k.nextInt();
                    laberinto.setCoordenadasIni(x1, y1);
                    System.out.println("Ahora, coloque las coordenadas de salida");
                    System.out.print("Eje x: ");
                    int x2=l.nextInt();
                    System.out.print("Eje y: ");
                    int y2=o.nextInt();
                    laberinto.setCoordenadasFin(x2, y2);
                    System.out.print(laberinto);
                    System.out.print("¿Es correcto su laberinto?\nPulse 0 para confirmar");
                    a=r.nextInt();
                }
                if (c==2){
                    int q=1;
                    while(q!=0){
                        System.out.println("Vuelva a configurar su laberinto, cuando este seguro, pulse 1 para continuar");
                        Scanner z= new Scanner(System.in);
                        int s=z.nextInt();
                        if(s==1){
                            Arch = new File("C:\\Users\\USUARIO\\Desktop\\laberinto.csv");
                            laberinto = new Tablero_L(Arch);
                            System.out.print(laberinto);
                            System.out.print("¿Es correcto su laberinto?\nPulse 0 para confirmar");
                            a=r.nextInt();
                            q=0;
                        } else{
                            System.out.println("Valor no valido, vuelva a intentarlo");
                        }
                    }
                }
            }
        }
        if (a==0){
            laberinto.reglas();
        }
    }   
}
