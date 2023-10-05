/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_segrega_interfaces_errado;

/**
 *
 * @author nando
 */
public class PP_Segrega_Interfaces_Errado {

    public static void main(String[] args) {
        Animal pato = new Pato();
        pato.comer();
        pato.nadar();
        pato.voar();

        Animal peixe = new Peixe();
        peixe.comer();
        peixe.nadar();
        peixe.voar();
    }
}
