/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soma_simples_bcc;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class Soma_simples_BCC {

    public static void main(String[] args) {
        String s;
        boolean valor;
        char opcao;
        Fatores numbers = new Fatores();
        
        s = JOptionPane.showInputDialog("Entre com o valor do primeiro fator");
        
        numbers.num1 = Integer.parseInt(s);
        numbers.num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo fator"));
        
        System.out.println("O valor da soma eh..: "+(numbers.num1+numbers.num2));
        
        if(numbers.num1>10){
            valor = true;
        }else
            valor = false;
        
        System.out.println("O resultado de valor eh ..: "+valor);
        
        opcao = 's';
        
        System.out.println("Opcao escolhida..: "+opcao);
        
    }
}
