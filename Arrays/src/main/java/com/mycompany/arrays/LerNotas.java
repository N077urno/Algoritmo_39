/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class LerNotas {
    
    float converter(String nota){
        return(Float.parseFloat(nota));
    }
    
    void creditos(){
        JOptionPane.showMessageDialog(null, "Desenvolvido por N@ndo");
    }
    
    void suporte(){
        System.out.println("Para suporte contacte o desenvolvedor");
    }
    
}
