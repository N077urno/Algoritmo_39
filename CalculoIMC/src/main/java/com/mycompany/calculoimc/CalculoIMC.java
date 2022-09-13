/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculoimc;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class CalculoIMC {

    public static void main(String[] args) {
        String s;
        
        Pessoa cidadao = new Pessoa();
        
        s = JOptionPane.showInputDialog("Entre com o seu nome");
        
        cidadao.nome = s;
        
        s = JOptionPane.showInputDialog("Entre com o valor da sua idade");
        
        cidadao.idade = Byte.parseByte(s);
        
        s = JOptionPane.showInputDialog("Entre com seu peso");
        
        cidadao.peso = Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Entre com sua altura");
        
        cidadao.altura = Float.parseFloat(s);
        
        cidadao.IMC = (float) (cidadao.peso / (Math.pow(cidadao.altura, 2)));
        
        System.out.println("Paciente "+cidadao.nome+" idade..: "+cidadao.idade+" peso..: "+cidadao.peso+" altura..: "+cidadao.altura+" valor do IMC..: "+cidadao.IMC);
    }
}
