/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;
import entidades.Cafetera;

import java.util.Scanner;
=======

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
        Scanner leer = new Scanner(System.in);
        Cafetera c1 = new Cafetera(10, 7);

        CafeteraServicio cs = new CafeteraServicio();
        
        System.out.println("Ingrese una opcíón");
        System.out.println("Opción 1: Llenar cafetera.");
        System.out.println("Opción 2: Servir taza.");
        System.out.println("Opción 3: Vaciar cafetera.");
        System.out.println("Opción 4: Agregar café.");
        int op = leer.nextInt();
        
        switch (op) {
            case 1:
                cs.llenarCafetera(c1);
                break;
            case 2:
                //cs.servirTaza();
                break;
            case 3:
                cs.vaciarCafetera(c1);
                break;
            case 4:
                cs.agregarCafe(c1);
                break;
            case 0:
                System.out.println("Hasta Pronto");;
                break;
            default:
                System.out.println("Opción incorrecta. Hasta pronto.");
                break;
        }


        CafeteraServicio s1 = new CafeteraServicio();


   // c1.setCantidadActual(s1.llenarCafetera(c1.getCapacidadMaxima(), c1.getCantidadActual()));
    // c1.setCantidadActual(s1.vaciarCafetera());
        System.out.println(c1);
        
    }
    
}
