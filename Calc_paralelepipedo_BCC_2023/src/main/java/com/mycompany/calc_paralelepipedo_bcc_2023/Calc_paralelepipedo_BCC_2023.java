/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calc_paralelepipedo_bcc_2023;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class Calc_paralelepipedo_BCC_2023 {

    public static void main(String[] args) {
        String s;
        double ta, tb, tc;
        Paralelepipedo pp = new Paralelepipedo();
        
        s = JOptionPane.showInputDialog("Entre com o valor do lado A");
        pp.dA = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Entre com o valor do lado B");
        pp.dB = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Entre comn o valor do lado C");
        pp.dC = Double.parseDouble(s);
        
        ta = Math.pow(pp.dA, 2);
        tb = Math.pow(pp.dB, 2);
        tc = Math.pow(pp.dC, 2);
        pp.dDiagonal = Math.sqrt(ta+tb+tc);
        
        JOptionPane.showMessageDialog(null,"O valor da Diagonal do Paralelepipedo é: "+pp.dDiagonal);
        
        
    }
}
