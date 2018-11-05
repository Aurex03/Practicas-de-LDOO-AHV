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
public class PlanCarroFactory {
    
    public PlanCarro getPaquete(int tipoPaquete){
    if(tipoPaquete == 20){
      return new Paquete20();
    }
    
    if(tipoPaquete == 30){
      return new Paquete30();
    }
    
    if(tipoPaquete == 50){
        return new Paquete50();
               
    }
       
    return null;
    
    }
    
}
