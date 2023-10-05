/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sequencia1;

/**
 *
 * @author nando
 */
public class Imprimir {
    
    void imprimirSequencia(int x){
        if(x == 0){//caso trivial
            return;
        }
        System.out.println(x);
        imprimirSequencia(x-1);//regra geral
    }
    
}
