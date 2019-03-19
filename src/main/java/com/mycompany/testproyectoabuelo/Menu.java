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
    /**
     * Mapa de Guarda Las Personas
     */
    public HashMap<Integer, Persona> mapaAbuelo; 
    Scanner scanner = new Scanner(System.in);
    /**
     * La variable cod Sirve para buscar a la persona segun su codigo
     */
    int cod;
    /**
     * La variable envia Sirve para traer el resultado
     */
    String envia;
    
    /**
     * El metodo Menu es donde inicia el programa Y se 
     * pondran los otros metodos de insercion de personas
     * y la busqueda
     */
    
   public void Menu() {      
        System.out.println("Digite el codigo que desea buscar:");
        cod = scanner.nextInt();
        mapaAbuelo = new HashMap<>();
        ingresarMapa();
        buscar(mapaAbuelo,cod);
    }
    
   /**
    * 
    * Metodo que ingresa las personas al Mapa mapaAbuelo
    */
    private void ingresarMapa(){
    
    mapaAbuelo = new HashMap<>();
    mapaAbuelo.put(1, new Persona(1, "Juan"));
    mapaAbuelo.put(1, new Persona(2,"Jose"));
    mapaAbuelo.get(1).getDatos().put(3, new Persona(3, "Andres"));
    mapaAbuelo.get(1).getDatos().put(4, new Persona(4, "Maria"));
    mapaAbuelo.get(1).getDatos().put(5, new Persona(5, "Carlos"));
    mapaAbuelo.get(2).getDatos().put(6, new Persona(6, "Alberto"));
    mapaAbuelo.get(2).getDatos().put(7, new Persona(7, "Jimmy"));
    mapaAbuelo.get(2).getDatos().put(8, new Persona(8, "Jhon"));
    mapaAbuelo.get(1).getDatos().get(3).getDatos().put(9, new Persona(9, "Juana"));
    mapaAbuelo.get(1).getDatos().get(3).getDatos().put(10, new Persona(10, "Paola"));
    mapaAbuelo.get(1).getDatos().get(4).getDatos().put(11, new Persona(11, "Sofia"));
    mapaAbuelo.get(1).getDatos().get(5).getDatos().put(12, new Persona(12, "Jaime"));
    mapaAbuelo.get(2).getDatos().get(6).getDatos().put(13, new Persona(13, "Tatiana"));
    mapaAbuelo.get(2).getDatos().get(6).getDatos().put(14, new Persona(14, "Fernanda"));
    mapaAbuelo.get(2).getDatos().get(7).getDatos().put(15, new Persona(15, "Viviana"));
    mapaAbuelo.get(2).getDatos().get(8).getDatos().put(16, new Persona(16, "Diana"));
    
    
    }
    
    /**
     * Este metodo sir ve `para buscar a la persona por el codigo
     * @param MapaAbuelo 
     * @param Cod // Codigo de la persona la cual se desea buscar
     * @return 
     */
    
    private String buscar(HashMap<Integer, Persona>mapaAbuleo, int cod){
        Persona Abuelo = null;
        Persona Padre = null;
        Persona Hijo = null;
         for(Integer key: mapaAbuelo.keySet()){
            Abuelo = mapaAbuelo.get(key);
            if(cod == key){
                System.out.println("Abuelo: " + Abuelo.getNombre());
            }
            for(Integer key2: Abuelo.getDatos().keySet()){
                Padre = Abuelo.getDatos().get(key2);
                if(cod == key2){                    
                    System.out.println("Abuelo: " + Abuelo.getNombre());
                    System.out.println("Padre: " + Padre.getNombre());
                }
                if(cod == key){
                    System.out.println("Padre : " + Padre.getNombre());
                }
                for(Integer key3: Padre.getDatos().keySet()){
                    Hijo = Padre.getDatos().get(key3);
                    if(cod == key3){      
                        System.out.println("Abuelo: " + Abuelo.getNombre());
                        System.out.println("Padre: " + Padre.getNombre());                        
                        System.out.println("Hijo: " + Hijo.getNombre());
                        break;
                    }
                    if(cod == key2){
                        System.out.println("Hijo: " + Hijo.getNombre());
                    }
                    if(cod == key){
                        System.out.println("Hijo: " + Hijo.getNombre());
                    }
                }
            }
        }
        return envia;
    }
    
}

