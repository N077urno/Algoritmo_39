/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algo53;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class Algo53 {

    public static void main(String[] args) {
        
        String s;
        float raiz, qda, qdb, qdc;
        
        Paralelepipedo PP = new Paralelepipedo();
        
        s = JOptionPane.showInputDialog("Entre com o valor da Lado A");
        
        PP.dA = Float.parseFloat(s);
        
        System.out.println("O valor do lado A informado eh..: "+PP.dA);
        
        s = JOptionPane.showInputDialog("Entre com o valor do Lado B");
        
        PP.dB = Float.parseFloat(s);
        
        System.out.println("O valor do lado B informado eh..: "+PP.dB);
        
        s = JOptionPane.showInputDialog("Entre com o lado C");
        
        PP.dC = Float.parseFloat(s);
        
        System.out.println("O valor do lado C informado eh..: "+PP.dC);
        
        qda = (float) Math.pow(PP.dA, 2);
        
        qdb = (float) Math.pow(PP.dB, 2);
        
        qdc = (float) Math.pow(PP.dC, 2);
        
        raiz = (float) Math.sqrt(qda+qdb+qdc);
        
        PP.dDiagonal = raiz;
        
        System.out.println("O valor da Diagonal do Paralelepipedo eh..: "+PP.dDiagonal);
        
    }
}
