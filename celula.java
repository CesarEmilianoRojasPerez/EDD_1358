/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class celula {
    int Ren;
    int Col;
    private final tablero<String> x;
    private final tablero<String> g;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public celula(int i, int j){
        this.Ren=i;
        this.Col=j;
        x=new tablero (i,j);
        g=new tablero (i,j);
        for (int a=0;a <this.Ren;a++){
            for (int b=0; b<this.Col; b++){
                x.setCasilla(a, b, ANSI_RED + "M " + ANSI_RESET);
                g.setCasilla(a, b, ANSI_RED + "M " + ANSI_RESET);
            }
        }
    }
    
    public boolean comprobacion(int i, int j) {
        return !(i < 0 || i >= this.Ren || j < 0 || j >= this.Col);
    }

    public void setCViva(int i,int j){
        if(comprobacion(i,j)){
            x.setCasilla(i ,j , ANSI_GREEN + "V " + ANSI_RESET);
            g.setCasilla(i ,j , ANSI_GREEN + "V " + ANSI_RESET);
        }
    }
    
    public int CVivas(int i,int j){
        int CelVivas=0;
        int g1 = i-1;
        int g2 = i+1;
        int f1 = j-1;
        int f2 = j+1;
        
        if (comprobacion (g1,f1) && (ANSI_GREEN + "V " + ANSI_RESET).equals(g.getCasilla(g1, f1))){
            CelVivas++;
        }
        if (comprobacion(g1,j) && (ANSI_GREEN + "V " + ANSI_RESET).equals(g.getCasilla(g1, j))){
            CelVivas++;
        }
        if (comprobacion(g1,f2) && (ANSI_GREEN + "V " + ANSI_RESET).equals(g.getCasilla(g1, f2))){
            CelVivas++;
        }
        if (comprobacion(i,f1) && (ANSI_GREEN + "V " + ANSI_RESET).equals(g.getCasilla(i, f1))){
            CelVivas++;
        }
        if (comprobacion(i,f2) && (ANSI_GREEN + "V " + ANSI_RESET).equals(g.getCasilla(i, f2))){
            CelVivas++;
        }
        if (comprobacion(g2,f1) && (ANSI_GREEN + "V " + ANSI_RESET).equals(g.getCasilla(g2, f1))){
            CelVivas++;
        }
        if (comprobacion(g2,j) && (ANSI_GREEN + "V " + ANSI_RESET).equals(g.getCasilla(g2, j))){
            CelVivas++;
        }
        if (comprobacion(g2,f2) && (ANSI_GREEN + "V " + ANSI_RESET).equals(g.getCasilla(g2, f2))){
            CelVivas++;
        }
        return CelVivas;
    }
    
    public void genReglas(int i, int j){
       
        if (CVivas(i,j) == 0 || CVivas(i,j)==1){
            x.setCasilla(i,j,ANSI_RED + "M " + ANSI_RESET);
            
        }
        
        if (CVivas(i,j) > 3){
            x.setCasilla(i,j,ANSI_RED + "M " + ANSI_RESET);
        }
        
        if (CVivas(i,j) == 3 && (ANSI_RED + "M " + ANSI_RESET).equals(g.getCasilla(i,j))){
            x.setCasilla(i, j, ANSI_GREEN + "V " + ANSI_RESET);
        }
    }
    public void nuevaGen(){
        int y=0;
        while(y<this.Ren){
            int x1=0;
            while(x1<this.Col){
                g.setCasilla(y, x1, x.getCasilla(y,x1));
                x1 = x1 + 1;
            }
            y = y+1;
        }
        
    }
    
    
    @Override
    public String toString() {
        return x.toString();
    }
}