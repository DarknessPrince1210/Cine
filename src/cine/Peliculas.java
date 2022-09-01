/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author diazt
 */
public class Peliculas {
    String titulo;
    int duracion;
    int edad_min;
    String director;
    
    public static void main(String []args){
        Peliculas monsters=new Peliculas();
        
        monsters.titulo=("Monsters Inc.");
        monsters.duracion=60;
        monsters.edad_min=12;
        monsters.director="Pixar";
        
        System.out.println(monsters.director);
        
    }
    
    
}
