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
public class operacion {
double n1, n2, resultado, operacion;
public operacion (double n1, double n2, char operacion){
    this.n1=n1;
    this.n2=n2;
    this.operacion=operacion;
}
public void mostarResultado(){
    System.out.println(this.n1+" "+ this.operacion+" "+this.n2+"="+this.Res);
    
}




}
