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



public class CafeteraServicio {
 
    public double llenarCafetera(double a, double b) {
        
       a = b;
        
       
    return b;
    }        

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
    
    

    /* public double llenarCafetera(double a, double b){
     
         b = a;
     
         
         return b;
     }
     
     public double vaciarCafetera(){
     
         double a = 0;
     
     return a;*/
     }

<<<<<<< HEAD
=======

}
>>>>>>> 0d3628dcddae7340b6126b7f559c44e484b90c2e
