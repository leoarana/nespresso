
package nespresso;

import entidades.Cafetera;
import servicios.CafeteraServicio;



import java.util.Scanner;
<<<<<<< HEAD
=======


>>>>>>> 0d3628dcddae7340b6126b7f559c44e484b90c2e
import servicios.CafeteraServicio;

/**
 *
 * @author leandro
 */

public class Nespresso {

   
    public static void main(String[] args) {

        
        Cafetera c1 = new Cafetera(10,7);
        CafeteraServicio cf1 = new CafeteraServicio();
        

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
r
        System.out.println(c1);
        
    }
    
}
