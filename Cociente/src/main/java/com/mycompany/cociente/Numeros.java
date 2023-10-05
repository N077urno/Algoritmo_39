/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cociente;

/**
 *
 * @author nando
 */
public class Numeros {
    //atributos
    float dividendo;
    float divisor;
    float cociente;
    float resto;
    
    //métodos
    void imprime(){
        System.out.println("Dividendo..: "+this.dividendo);
        System.out.println("Divisor..: "+this.divisor);
        System.out.println("Quociente..: "+this.cociente);
        System.out.println("Resto..: "+this.resto);
    }
    
    float Div(float dividendo, float divisor){
        return(dividendo / divisor);
    }
    
    float mod(float dividendo, float divisor){
        return(dividendo % divisor);
    }
}
