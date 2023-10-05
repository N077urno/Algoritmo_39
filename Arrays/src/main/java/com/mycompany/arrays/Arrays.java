/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class Arrays {

    public static void main(String[] args) {
        String nome[] = new String[3];
        float dadosEscolares[][] = new float[3][6];
        String n;
        float soma = 0, media = 0;
        
        LerNotas nt = new LerNotas();
        
        for(int i=0; i<3; i++){
            nome[i] = JOptionPane.showInputDialog("Entre com o nome do aluno "+(i+1));
            
            n = JOptionPane.showInputDialog("Entre com a matricula do aluno(a) "+nome[i]);
            
            dadosEscolares[i][0] = nt.converter(n);
            
            for(int j=1; j<5;j++){
                n = JOptionPane.showInputDialog("Entre com a nota "+j+" do aluno(a) "+nome[i]);
                dadosEscolares[i][j] = nt.converter(n);
                
            }
            
            soma = 0;
            for(int j=1; j<5;j++){
                soma = soma + dadosEscolares[i][j];
            }
            
            dadosEscolares[i][5] = soma/4;
            
        }
        
        for(int i=0;i<3;i++){
            System.out.println("----------------------");
            System.out.println("Os Dados Escolares do aluno(a) "+nome[i]);
            
            System.out.println("O numero de matricula eh..: "+dadosEscolares[i][0]);
            
            for(int j=1; j<5;j++){
                System.out.println("O valor da nota "+j+" eh..: "+dadosEscolares[i][j]);
            }
            
            System.out.println("A media final foi..: "+dadosEscolares[i][5]);
        }
        
        nt.creditos();
        nt.suporte();
    }
}
