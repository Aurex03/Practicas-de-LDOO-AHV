/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Aurelio Hernandez Valdes
 */
public class Cliente {
    
    
    public static void main(String[] args){
   
    int tipoPaquete = 30;
    
    PlanCarro paquete = new PlanCarroFactory().getPaquete(tipoPaquete);
    
    paquete.setTelefono("811412392");
    String telefono = paquete.getTelefono();
    System.out.println("Su telefono "+telefono+ " junto con el paquete disponible es:");
    paquete.descripcionPaquete();;
        
    }
    
}
