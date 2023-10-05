/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deque;

/**
 *
 * @author nando
 */
public class Celula {
    int chave; // valor de identificação da célula
    String nome; // Nome na célula
    int idade; // idade da pessoa na célula
    Celula proxima = null; //referência para a próxima célula
    Celula anterior = null; //referência para célula anterior
    
    Celula(){
        
    }
    
    Celula(int chave, String nome, int idade){
        this.chave = chave;
        this.nome = nome;
        this.idade = idade;
    }
    
    int getChave(){
        return this.chave;
    }
    
    String getNome(){
        return this.nome;
    }
    
    int getIdade(){
        return this.idade;
    }
    
    void setChave(int chave){
        this.chave = chave;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setIdade(int idade){
        this.idade = idade;
    }
    
    void setAnterior(Celula atual){
        this.anterior = atual;
    }
    
    void setProxima(Celula atual){
        this.proxima = atual;
    }
}
