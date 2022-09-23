/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class inJuego {
    int Ren;
    int Col;
    private celula w;
    
    public inJuego(int i, int j){
        this.Ren=i;
        this.Col=j;
        w= new celula(i,j);
    }
    
    public void confInicial(int a){
        int s=1;
        Scanner t = new Scanner(System.in);
        System.out.println("Pon las coordenadas de donde quieras poner las Celulas Vivas");
        while(s <=a){
            System.out.print("Renglon: ");
            int b = t.nextInt();
            System.out.print("Columna: ");
            int c = t.nextInt();
            w.setCViva(b, c);
            System.out.println("");
            s +=1;
        }
    }
    
    public void siguienteGen(){
        int y=0;
        while(y<this.Ren){
            int x=0;
            while(x<this.Col){
                w.genReglas(y, x);
                x = x+1;
            }
            y = y+1;
        }
        w.nuevaGen();
    }
    
    
    @Override
    public String toString() {
        return w.toString();
    }
}
