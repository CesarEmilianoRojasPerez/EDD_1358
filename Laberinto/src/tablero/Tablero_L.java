/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import ADT.ADTLista;
import ADT.Adt2D_L;
import ADT.AdtPila;
/**
 *
 * @author USUARIO
 */
public class Tablero_L {
    
    int tam = 0;
    String LineasL = "";
    ArrayList<ArrayList<String>> OutterArray = new ArrayList();
    Adt2D_L<Integer> tablero;
    Adt2D_L<String> tablero2; 
    AdtPila<ADTLista> camino;
    ADTLista<Integer> aux1;
    String[] lineas;
    String[] tamlis;
    int y1,y2;
    int x1,x2;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public Tablero_L(File Arch) {
        try {

            BufferedReader lector = new BufferedReader(new FileReader(Arch));
            String Leido;

            while ((Leido = lector.readLine()) != null){
                lineas = Leido.split(",");
                tamlis = Leido.split("\n");
                tam += tamlis.length;
                ArrayList<String> InnerArray = new ArrayList();
                for (String datos : lineas){
                    InnerArray.add(datos);
                }
                OutterArray.add(InnerArray);
            }
            
            Integer Ren =Integer.parseInt(OutterArray.get(0).get(0));
            Integer Col =Integer.parseInt(OutterArray.get(1).get(0));
            tablero = new Adt2D_L(Ren,Col);
            tablero2 = new Adt2D_L(Ren,Col);
            int a=0;
            while (a<Ren){
                int b=0;
                int c=a+2;
                while(b<Col){
                    if ("0".equals(OutterArray.get(c).get(b))){
                        tablero.setElemento(a, b, 0);
                        tablero2.setElemento(a,b,"M");
                    }
                    else if ("1".equals(OutterArray.get(c).get(b))){
                        tablero.setElemento(a,b,1);
                        tablero2.setElemento(a, b,ANSI_GREEN + "P" + ANSI_RESET);
                    }
                    b+=1;
                }
                a+=1;
            }
            
            int d = tam - 2;
            int e = tam - 1;
            this.x1 = Integer.parseInt(OutterArray.get(d).get(1));
            this.y1 = Integer.parseInt(OutterArray.get(d).get(0));
            this.x2 = Integer.parseInt(OutterArray.get(e).get(1));
            this.y2 = Integer.parseInt(OutterArray.get(e).get(0));
            tablero.setElemento(y1,x1,2);
            tablero2.setElemento(y1, x1,ANSI_PURPLE + "E" + ANSI_RESET);
            tablero.setElemento(y2, x2, 3);
            tablero2.setElemento(y2,x2, ANSI_PURPLE + "S" + ANSI_RESET);  
        } 
        catch (IOException ex){
        }
    }
    
    public boolean comprobacion(int i, int j) {
        return !(i < 0 || i >= tablero2.getRen() || j < 0 || j >= tablero2.getCol());
    }
    
    public AdtPila reglas(){
        String visitado = ANSI_BLUE+"~"+ANSI_RESET;
        camino = new AdtPila();
        aux1 = new ADTLista(2);
        int Lx=x1;
        int Ly=y1;
        aux1.setElemento(1, this.y1);
        aux1.setElemento(0,this.x1);
        camino.Push(aux1);
        while (tablero.getElemento(Ly, Lx)!= 3){
            ADTLista<Integer> aux2= new ADTLista(2);
            aux2=camino.Peek();
            Ly=aux2.getElemento(1);
            Lx=aux2.getElemento(0);
            if (tablero.getElemento(Ly, Lx)==3){
                
            } //Izquierda
            else if(comprobacion(Ly,Lx-1)&&(tablero.getElemento(Ly,Lx-1)==1)|| comprobacion(Ly,Lx-1)&&tablero.getElemento(Ly, Lx-1)==3){
                if(comprobacion(Ly,Lx-1)&&tablero.getElemento(Ly, Lx-1)==3){
                    ADTLista<Integer> aux3=new ADTLista(2);
                    aux3.setElemento(1,Ly);
                    aux3.setElemento(0,Lx-1);
                    camino.Push(aux3);
                    aux3=null;
                    
                }else{
                    ADTLista<Integer> aux3=new ADTLista(2);
                    tablero.setElemento(Ly,Lx-1,2);
                    tablero2.setElemento(Ly, Lx-1, visitado);
                    aux3.setElemento(1,Ly);
                    aux3.setElemento(0,Lx-1);
                    camino.Push(aux3);
                    aux3=null;
                    
                }
            } //Arriba
            else if(comprobacion(Ly-1,Lx)&&(tablero.getElemento(Ly-1,Lx)==1)|| comprobacion(Ly-1,Lx)&&tablero.getElemento(Ly-1, Lx)==3){
                if(comprobacion(Ly-1,Lx)&&tablero.getElemento(Ly-1, Lx)==3){
                    ADTLista<Integer> aux3=new ADTLista(2);
                    aux3.setElemento(1,Ly-1);
                    aux3.setElemento(0,Lx);
                    camino.Push(aux3);
                    aux3=null;
                    
                }
                else{
                    ADTLista<Integer> aux3=new ADTLista(2);
                    tablero.setElemento(Ly-1,Lx,2);
                    tablero2.setElemento(Ly-1,Lx, visitado);
                    aux3.setElemento(1,Ly-1);
                    aux3.setElemento(0,Lx);
                    camino.Push(aux3);
                    aux3=null;
                    
                }
            }//Derecha
            else if(comprobacion(Ly,Lx+1)&&(tablero.getElemento(Ly,Lx+1)==1)|| comprobacion(Ly,Lx+1)&&tablero.getElemento(Ly, Lx+1)==3){
                if(comprobacion(Ly,Lx+1)&&tablero.getElemento(Ly, Lx+1)==3){
                    ADTLista<Integer> aux3=new ADTLista(2);
                    aux3.setElemento(1,Ly);
                    aux3.setElemento(0,Lx+1);
                    camino.Push(aux3);
                    aux3=null;

                }
                else{
                    ADTLista<Integer> aux3=new ADTLista(2);
                    tablero.setElemento(Ly,Lx+1,2);
                    tablero2.setElemento(Ly, Lx+1, visitado);
                    aux3.setElemento(1,Ly);
                    aux3.setElemento(0,Lx+1);
                    camino.Push(aux3);
                    aux3=null;
                    
                }
            }//Abajo
            else if(comprobacion(Ly+1,Lx)&&(tablero.getElemento(Ly+1,Lx)==1)|| comprobacion(Ly+1,Lx)&&tablero.getElemento(Ly+1, Lx)==3){
                if(comprobacion(Ly+1,Lx)&&tablero.getElemento(Ly+1, Lx)==3){
                    ADTLista<Integer> aux3=new ADTLista(2);
                    aux3.setElemento(1,Ly+1);
                    aux3.setElemento(0,Lx);
                    camino.Push(aux3);
                    aux3=null;
                    
                }
                if (comprobacion(Ly+1,Lx)&&(tablero.getElemento(Ly+1,Lx)==1)){
                    ADTLista<Integer> aux3=new ADTLista(2);
                    tablero.setElemento(Ly+1,Lx,2);
                    tablero2.setElemento(Ly+1,Lx, visitado);
                    aux3.setElemento(1,Ly+1);
                    aux3.setElemento(0,Lx);
                    camino.Push(aux3);
                    aux3=null;
                    
                }
            } 
            else {
                tablero.setElemento(Ly, Lx, 4);
                tablero2.setElemento(Ly,Lx,ANSI_RED+"+"+ANSI_RESET);
                camino.Pop();
            }
            
        }
        System.out.print("Laberinto resuelto\n"+tablero2);
        System.out.println("Camino a seguir (La numeracion es de 0 para mas, de izquierda a derecha en X y de arriba a abajo en Y)");
        System.out.println("La lista se lee de abajo hacia arriba");
        camino.ImpPila();
        return camino;
    }
    
    @Override
    public String toString() {
        return "Laberinto sin resolver\n"+tablero2;
    }
}
