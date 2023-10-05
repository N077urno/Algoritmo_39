/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplopilha2;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
public class Pilha {
    /*atributos*/
    int[] pilha = new int[10];
    int topopilha = -1;
    
    /*métodos*/
    int esvazie_pilha(){
        this.topopilha = -1;
        return(this.topopilha);
    }
    
    int tamanho(){
        return(this.topopilha+1);
    }
    
    void imprimir(int topo){
        for(int i=topo;i>=0;i--){
            System.out.println("O valor na pilha eh..: "+this.pilha[i]);
        }
    }
    
    int push(int topo, int num){
        this.topopilha = topo;
        this.topopilha++;
        
        if(this.topopilha < 0){
            this.topopilha = 0;
        }
        
        if(this.topopilha > 9){
            JOptionPane.showMessageDialog(null,"Estouro de pilha! Erro: -999");
            return(this.topopilha--);
        }else{
            this.pilha[this.topopilha]=num;
            System.out.println("Inserindo o elemento..: "+num);
            return(this.topopilha);
        }
    }
    
    int pop(int topo){
        this.topopilha = topo;
        this.topopilha--;
        
        if(this.topopilha < -1){
            JOptionPane.showMessageDialog(null, "Pilha vazia! Erro - 997");
            return(this.topopilha++);
        }else{
            System.out.println("Retirando o valor..: "+this.pilha[this.topopilha+1]);
            return(this.pilha[this.topopilha+1]);
        }
    }
    
    int top(int topo){
        this.topopilha = topo;
        if(this.topopilha < 0){
            JOptionPane.showMessageDialog(null,"Pilha Vazia! Erro: -998");
            return(-998);
        }else{
            return(this.pilha[this.topopilha]);
        }
    }
    
    
    
}
