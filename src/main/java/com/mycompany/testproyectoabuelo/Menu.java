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

