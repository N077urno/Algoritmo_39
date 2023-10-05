/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_liskov_certo;

/**
 *
 * @author nando
 */
public class PP_Liskov_Certo {

    public static void main(String[] args) {
        Forma quadrado = new Quadrado(5);
        System.out.println("Area da forma geometrica..: "+quadrado.getArea());
        
        Forma retangulo = new Retangulo(5,3);
        
        System.out.println("Area da forma geometrica..: "+retangulo.getArea());
    }
}
