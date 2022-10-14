package ADT;

/**
 *
 * @author USUARIO
 * @param <T>
 */
public class Adt2D_L<T> {
    private int Ren;
    private int Col;
    private Adt_L matriz;
    private Adt_L cols;
    private Adt_L<T> Item2;
    
    public Adt2D_L(int ren, int col){
        this.Ren = ren;
        this.Col = col;
        matriz = new Adt_L(ren);
        for (int F = 0; F < ren; F++) {
            matriz.setElemento(F, new Adt_L(col));
        }
    }
    
    private boolean comprobacion(int indice) {
        return indice >= 0 && indice < this.Ren;
    }
    
    public void setElemento(int ren,int col, T dato){
        if (comprobacion(ren)){
            cols = (Adt_L) matriz.getElemento(ren);
            cols.setElemento(col, dato);          
            matriz.setElemento(ren, (T) cols);
        }
    }
    
    public T getElemento(int ren,int col){
        if (comprobacion(ren)){
            cols=(Adt_L)matriz.getElemento(ren);
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
    
    public void limpiar(T dato){
        for (int Posi1 = 0; Posi1 < this.Ren; Posi1++) {
            Item2= new Adt_L(this.Ren);
            int x = 0;
            while(x < this.Col){
                Item2.setElemento(x, dato);
                x+=1;
            }
            matriz.setElemento(Posi1, Item2);
        }
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
