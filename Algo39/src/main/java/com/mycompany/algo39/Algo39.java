/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algo39;
import javax.swing.JOptionPane;
/**
 *
 * @author nando
 */
public class Algo39 {

    public static void main(String[] args) {
        float nota1, nota2, media;
        String s;
        
        s = JOptionPane.showInputDialog("Digite a nota 1");
        
        nota1 = Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Digite a nota 2");
        
        nota2 = Float.parseFloat(s);
        
        media = (nota1 + nota2)/2;
        
        System.out.println("Media ..: "+media);
    }
}
