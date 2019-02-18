/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraclass;

/**
 *
 * @author Alumno
 */
public class Calculadoraclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1=10;
        double n2=5;
       //suma
       suma sum= new suma (n1,n2);
       sum.mostarResultado();
       
       resta res= new resta (n1,n2);
       res.mostarResultado();
       
       multipliacion mult= new multipliacion (n1,n2);
       mult.mostarResultado();
       
       division div= new division (n1,n2);
       div.mostarResultado();
       
        
        
        
        
    }
    
}
