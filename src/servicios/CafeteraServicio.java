/*
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
*/
package servicios;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author leandro
 */


public class CafeteraServicio {
 
    public double llenarCafetera(double a, double b) {
        
       a = b;
        
       
    return b;
         
    }




 

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
    
    

    /* public double llenarCafetera(double a, double b){
     
         b = a;
     
         
         return b;
     }
     
     public double vaciarCafetera(){
     
         double a = 0;
     
     return a;*/
    
    
    public void sevirTaza(Cafetera c1, double cantidadActual) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escoga el tamaño de la taza vacia");
        System.out.println("1) 250ml");
        System.out.println("2) 340ml");
        System.out.println("3) 420ml");
        int tamañotaza = leer.nextInt();

        switch (tamañotaza) {
            case 1:
                if (cantidadActual < tamañotaza) {
                    System.out.println("La taza no se alcanzo a llenar. Para completarla faltó" + (tamañotaza - cantidadActual));
                } else {
                    System.out.println("La taza está llena");
                }
                break;
            case 2:
                if (cantidadActual < tamañotaza) {
                    System.out.println("La taza no se alcanzo a llenar. Para completarla faltó" + (tamañotaza - cantidadActual));
                } else {
                    System.out.println("La taza está llena");
                }
                break;
            case 3:
                if (cantidadActual < tamañotaza) {
                    System.out.println("La taza no se alcanzo a llenar. Para completarla faltó " + (tamañotaza - cantidadActual) + "ml");
                } else {
                    System.out.println("La taza está llena");
                }
                break;
            default:
                System.out.println("El número ingresado no es válido");
        }
     

    }

     }





