/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algo82_bcc_2023;

import javax.swing.JOptionPane;
/**
 *
 * @author nando
 */
public class Algo82_BCC_2023 {

    public static void main(String[] args) {
        Num n = new Num();
        
        n.fNum = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor do número"));
        
        if(n.fNum > 20 ){
            n.fMet = n.fNum/2;
            JOptionPane.showMessageDialog(null,"A metade do número é..: "+n.fMet);
        }else{
            n.fDobro = 2*n.fNum;
            JOptionPane.showMessageDialog(null,"O dobro do número é..: "+n.fDobro);
        }
        
    }
}
