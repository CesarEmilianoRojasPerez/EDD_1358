

import java.util.ArrayList;

public class ADT_S<T> {

    int tamanio;
    ArrayList<T> datos;

    /**
     *
     * @param tam
     */
    public ADT_S(int tam) {
        this.tamanio = tam;
        datos = new ArrayList(this.tamanio);
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.add(null);
        }
    }

    public T getElemento(int indice) {
        if (comprobacion(indice)) {
            return this.datos.get(indice);
        }
        return null;
    }

    private boolean comprobacion(int indice) {
        return indice >= 0 && indice < this.tamanio;
    }

    public void setElemento(int indice, T dato) {
        if (comprobacion(indice)) {
            this.datos.set(indice, dato);
        }
    }

    public int getLongitud() {
        return this.tamanio;
    }

    public void limpiar(T dato) {
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.set(i, dato);
        }
    }
    
    @Override
    public String toString(){
        String estado = "";
        for (T dato : datos) {
            if(dato != null){
                estado += dato.toString();
            }
        }
        return estado + "\n";
    }
}
