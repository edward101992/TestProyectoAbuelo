/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproyectoabuelo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Sebastian Rincon, Edward Ramos
 */
public class Menu {
    
    public HashMap<Integer, Persona> mapaAbuelo;
    
    Scanner scanner = new Scanner(System.in);
    
    int cod;
    String envia;
    
    
    Public void Menu(){
    
            System.out.println("Escriba el Codigo de la Persona");
            cod = scanner.nextInt();
            mapaAbuelo = new HashMap<>();
            ingresarMapa();
            buscar(mapaAbuelo,cod);
            
    }
    
    private void ingresarMapa(){
    
    mapaAbuelo = new HashMap<>();
    mapaAbuelo.put(1, new Persona(1, "Juan", "Galindo"));
    
    }
}
