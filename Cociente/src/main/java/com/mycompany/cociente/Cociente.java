/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cociente;

/**
 *
 * @author nando
 */
public class Cociente {

    public static void main(String[] args) {
        Numeros num = new Numeros();
        
        num.dividendo = 10;
        num.divisor = 3;
        
        num.cociente = num.Div(num.dividendo, num.divisor);
        num.resto = num.mod(num.dividendo, num.divisor);
        
        num.imprime();
    }
}
