
public class Adt2D<T> {
    private int Ren;
    private int Col;
    private final ADT_S matriz;
    private ADT_S cols;
    private ADT_S<T> Item2;
    
    public Adt2D(int ren, int col){
        this.Ren = ren;
        this.Col = col;
        matriz = new ADT_S(ren);
        for (int F = 0; F < ren; F++) {
            matriz.setElemento(F, new ADT_S(col));
        }
    }
    
    private boolean comprobacion(int indice) {
        return indice >= 0 && indice < this.Ren;
    }
    
    public void setElemento(int ren,int col, T dato){
        if (comprobacion(ren)){
            cols = (ADT_S) matriz.getElemento(ren);
            cols.setElemento(col, dato);          
            matriz.setElemento(ren, (T) cols);
        }
    }
    
    public void limpiar(T dato){
        for (int Posi = 0; Posi < this.Ren; Posi++) {
            Item2 = new ADT_S(this.Ren);
            Item2.setElemento(Posi, dato);
            matriz.setElemento(Posi, Item2);
        }
    }  
    public T getElemento(int ren,int col){
        if (comprobacion(ren)){
            cols=(ADT_S)matriz.getElemento(ren);
            return (T)cols.getElemento(col);
        }
        return null;
    }
    
    public int getRen(){
        return this.Ren;
    }
    
    public int getCol(){
        return this.Col;
    }
    
    @Override
    public String toString() {
        int g=0;
        if (g<this.Ren){
            return matriz.toString();
        }
        else {
            return matriz.toString();
        }
    }
    
}

