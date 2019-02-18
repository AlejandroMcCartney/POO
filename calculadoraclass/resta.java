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
public class resta extends operacion {
    double resta;
    public resta (double n1, double n2){
        super(n1, n2 ,'+');
        this.resta=n1+n2;
        this.setRes(this.suma);
        
    }
    
}
