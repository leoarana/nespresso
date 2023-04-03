
package nespresso;

import entidades.Cafetera;
import servicios.CafeteraServicio;

public class Nespresso {

   
    public static void main(String[] args) {
        
        Cafetera c1 = new Cafetera(10,7);
        CafeteraServicio cf1 = new CafeteraServicio();
        
        System.out.println(c1);
        
    }
    
}
