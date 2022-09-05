/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author diazt
 */
public class Cine {
    private Asiento asientos[][];
    private double precio;
    private Peliculas pelicula;
    private char[] letras={'A','B','C','D','E','F','G','H'};
    private char letra;

    public Cine(int filas, int columnas, double precio, Peliculas pelicula) {
        asientos=new Asiento[filas][columnas];
        this.precio=precio;
        this.pelicula=pelicula;
        generarAsientos();
        
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula)  {
        this.pelicula = pelicula;
    }
    
    private void generarAsientos(){
        
        int fila=asientos.length;
        for(int i=0;i<asientos.length;i++){
            
            
            
            for(int j=0;j<asientos[0].length;j++){
                for(int k=0;k<letras.length;i++){
                letra=letras[i];
                }
                asientos[i][j] = new Asiento(letra,fila,false);
                
            }
            
            fila --;
        }
        
        
        
    }
    
    
    
}
