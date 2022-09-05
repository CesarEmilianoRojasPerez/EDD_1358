package empresa;

import adt.adt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Nomina{

    int tam = 0;
    String LineasL = "";
    ArrayList<ArrayList<String>> OutterArray = new ArrayList();
    adt Nomina;
    String[] lineas;
    String[] tamlis;
    Trabajador tra;

    public Nomina(File Arch) {
        try {

            BufferedReader lector = new BufferedReader(new FileReader(Arch));
            String Leido;

            while ((Leido = lector.readLine()) != null){
                lineas = Leido.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                tamlis = Leido.split("\n");
                tam += tamlis.length;
                ArrayList<String> InnerArray = new ArrayList();
                for (String datos : lineas){
                    InnerArray.add(datos);
                }
                OutterArray.add(InnerArray);
            }

            Nomina = new adt(tam - 1);
            int Columnas = 0;
            for (int Filas = 1; Filas < OutterArray.size(); Filas++){
                tra = new Trabajador(Integer.parseInt(OutterArray.get(Filas).get(0)), OutterArray.get(Filas).get(1), OutterArray.get(Filas).get(2), OutterArray.get(Filas).get(3), Integer.parseInt(OutterArray.get(Filas).get(4)), Integer.parseInt(OutterArray.get(Filas).get(5)), Integer.parseInt(OutterArray.get(Filas).get(6)));
                Nomina.setElemento(Columnas, tra);
                Columnas++;
            }

        } 
        catch (IOException ex){
        }

    }

    public void listar_sueldos() {
        for (int tamanio = 0; tamanio < Nomina.getLongitud(); tamanio++){
            Trabajador Imp;
            Imp = (Trabajador) Nomina.getElemento(tamanio);
            System.out.println("Id: " + Imp.get_NumTrabajador() + ", Sueldo: " + Imp.CalcularSueldo());
            
        }
    }
    public void mayor_antigueadad() {
        int Max = 2023;
        for(int index=0; index < Nomina.getLongitud(); index++){
            Trabajador Imp;
            Imp = (Trabajador) Nomina.getElemento(index);
            if(Imp.get_Anio_Ingreso() < Max){
                int Indice = index;
                Max = Imp.get_Anio_Ingreso();
        System.out.println("Mayor Antiguedad:" + Nomina.getElemento(Indice));    
            }
        }
    }
}
