/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproyectoabuelo;
import java.util.HashMap;

/**
 *
 * @author Sebastian Rincos, Edward Ramos
 */
public class Persona {
    
    private int codigo;
    private String nombre;
    private HashMap<Integer,Persona> datos;
    
    public Persona(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        datos = new HashMap<>();
        
    }

    public int getCodigo() {
        return codigo;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public HashMap<Integer, Persona> getDatos() {
        return datos;
    }
}
