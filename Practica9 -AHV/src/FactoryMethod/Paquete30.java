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
public class Paquete30 extends PlanCarro {
    
    @Override
    public void descripcionPaquete(){
        System.out.println("Felicidades");
        System.out.println("*|   !Ganaste Carro!                            |*"); 
        System.out.println("*|   Azul    |*");
        System.out.println("*|   Precio= $250000 pesos      |*");
        System.out.println("*|   A credito*| ");
        System.out.println("*----------------------------------------*");
    
        }
}