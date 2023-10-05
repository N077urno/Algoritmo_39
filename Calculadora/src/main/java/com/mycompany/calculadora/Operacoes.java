/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class Operacoes {
    
    int lerValor(){
        String n;
        
        n = JOptionPane.showInputDialog("Entre com o valor para a calculadora");
        
        return(Integer.parseInt(n));
    }
    
    int soma(int A, int B){
        return(A + B);
    }
    
    void imprime(int v1, int v2, int resp){
        System.out.println("valor 1: "+v1+" valor 2: "+v2);
        System.out.println("A reposta eh..: "+resp);
    }
    
    int mult(int A, int B){
        return(A*B);
    }
    
    int sub(int A, int B){
        return(A-B);
    }
    
    int div(int A, int B){
        return((int) A/B);
    }
    
}
