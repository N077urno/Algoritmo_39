/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_liskov_errado;

/**
 *
 * @author nando
 */
public class PP_Liskov_Errado {

    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();
        retangulo.setAltura(5);
        retangulo.setLargura(4);
        System.out.println("A Area do Objeto eh..: "+retangulo.getArea());
    }
}
