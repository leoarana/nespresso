/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;
import entidades.Cafetera;
import servicios.CafeteraServicio;

/**
 *
 * @author leandro
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera(10, 7);
        CafeteraServicio s1 = new CafeteraServicio();

   // c1.setCantidadActual(s1.llenarCafetera(c1.getCapacidadMaxima(), c1.getCantidadActual()));
    // c1.setCantidadActual(s1.vaciarCafetera());
        System.out.println(c1);
        
    }
    
}
