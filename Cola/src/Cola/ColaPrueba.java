/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cola;

/**
 *
 * @author USUARIO
 */
public class ColaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        cola<Integer> j=new cola();
        j.enqueue(100);
        j.enqueue(50);
        j.enqueue(60);
        System.out.print(j);
        System.out.println("");
        Integer u= j.dequeue();
        System.out.println(u);
        System.out.println("");
        System.out.print(j);
    }
}
