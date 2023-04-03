/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cafetera;

/**
 *
 * @author leandro
 */
public class CafeteraServicio {
 

    public void llenarCafetera(Cafetera c1){
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La cafetera está llena. \n Tiene " + c1.getCantidadActual() + "ltrs.");
    }
    
    public void vaciarCafetera (Cafetera c1){
        c1.setCantidadActual(0);
        System.out.println("Cafetera Vacía");
    }
    
    public void agregarCafe (Cafetera c1){
        System.out.println("Agregar" + (c1.getCapacidadMaxima() - c1.getCantidadActual()) + "café." );
        System.out.println("Gracias!");
    }
    
    

     public double llenarCafetera(double a, double b){
     
         b = a;
     
         
         return b;
     }
     
     public double vaciarCafetera(){
     
         double a = 0;
     
     return a;
     }

}
