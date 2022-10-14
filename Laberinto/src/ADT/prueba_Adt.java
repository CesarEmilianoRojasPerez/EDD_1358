/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADT;

/**
 *
 * @author USUARIO
 */
public class prueba_Adt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdtPila<ADTLista> j = new AdtPila();
        ADTLista<Integer> p= new ADTLista(2);
        int x =0;
        while(x<22){
            ADTLista<Integer> aux2= new ADTLista(2);
            aux2.setElemento(0, x);
            x+=2;
            aux2.setElemento(1, x);
            x+=2;
            j.Push(aux2);
            aux2=null;
        }
        ADTLista<Integer> y=new ADTLista(2);
        j.ImpPila();
        j.Pop();
        j.ImpPila();
        y=j.Peek();
        System.out.println(y.getElemento(0));
    }
    
}
