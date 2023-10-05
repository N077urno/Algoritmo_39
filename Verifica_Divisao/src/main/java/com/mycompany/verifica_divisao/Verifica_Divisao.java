/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.verifica_divisao;

import javax.swing.JOptionPane;
/**
 *
 * @author nando
 */
public class Verifica_Divisao {

    public static void main(String[] args) {
        Num n = new Num();
        
        n.fNumerador = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do numerador"));
        n.fDenominador = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do Denominador"));
        
        if(n.fDenominador!=0){
            n.fResultado = n.fNumerador / n.fDenominador;
            JOptionPane.showMessageDialog(null,"O resultado da divisao é..: "+n.fResultado);
        }else
            JOptionPane.showMessageDialog(null,"A divisão não pode ser realizada");
    }
}
