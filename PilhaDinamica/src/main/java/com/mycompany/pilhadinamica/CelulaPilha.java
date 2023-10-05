/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhadinamica;

/**
 *
 * @author nando
 */
public class CelulaPilha {
    String nome;  //dado quardado na célula da pilha
    String cpf; //dado cepf
    CelulaPilha anterior;  //referência para a célula anterior
    
    CelulaPilha(){ //construtor padrão
        
    }
    
    CelulaPilha(String nome, String cpf, CelulaPilha anterior){
        this.nome = nome; //nome que vai ser inserido na célula
        this.cpf = cpf;
        this.anterior = anterior; //a referência para a célula anterior
    }
    
    String getNome(){
        return this.nome; //pega o nome na célula e retorna para o main
    }
    
    String getCpf(){
        return this.cpf;
    }
    
    void setNome(String nome){
        this.nome = nome; //coloca o nome dentro da célula
    }
    
    void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    CelulaPilha getAnterior(){
        return this.anterior; //pega a referência da célula anterior na pilha
    }
    
    void setAnterior(CelulaPilha anterior){
        this.anterior = anterior; //coloca a referência a célula anterior
    }
    
}
