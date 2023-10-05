/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algo88_bcc_2023;

import javax.swing.JOptionPane;
/**
 *
 * @author nando
 */
public class Algo88_BCC_2023 {

    public static void main(String[] args) {
        int sOP;
        
        Calculadora calc = new Calculadora();
        
        calc.fNum1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor do primeiro termo"));
        calc.fNum2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor do segundo termo"));
        
        sOP = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da operação: 1 - Soma; 2 - Subtração; 3 - Multiplicação; 4 - Divisão"));
        
        switch(sOP){
            case 1: calc.fResp = calc.fNum1 + calc.fNum2;
                      JOptionPane.showMessageDialog(null,"O valor encontrado é..: "+calc.fResp);
                      break;
            case 2: calc.fResp = calc.fNum1 - calc.fNum2;
                      JOptionPane.showMessageDialog(null,"O valor encontrado é..: "+calc.fResp);
                      break;
            case 3: calc.fResp = calc.fNum1 * calc.fNum2;
                      JOptionPane.showMessageDialog(null,"O valor encontrado é..: "+calc.fResp);
                      break;
            case 4: calc.fResp = calc.fNum1 / calc.fNum2;
                      JOptionPane.showMessageDialog(null,"O valor encontrado é..: "+calc.fResp);
                      break;
            default: JOptionPane.showMessageDialog(null,"Opção Inválida");          
        }
    }
}
