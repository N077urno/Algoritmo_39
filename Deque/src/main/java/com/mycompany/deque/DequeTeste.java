/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deque;

/**
 *
 * @author nando
 */
public class DequeTeste {
    Celula inicio = null; //cria a referência para a célula no inicio do deque
    
    Celula inicializaDeque(Celula inicio, int chave, String nome, int idade){
        Celula novaCelula = new Celula(); // cria a célula vazia
        this.inicio = novaCelula; //faz a referência apontar para a célula
        novaCelula.proxima = this.inicio; //faz a próxima referência apontar para a nova célula
        novaCelula.anterior = this.inicio; //faz a referência anterior apontar para nova célula
        novaCelula.chave = chave;
        novaCelula.nome = nome;
        novaCelula.idade = idade;
        
        return this.inicio;
        
    }
    
    Celula insereNoComeco(int chave, String nome, int idade, Celula inicio){
        Celula novaCelula = new Celula(); // cria uma nova célula
        this.inicio.anterior = novaCelula; //faz a referência anterior apontar para ela
        novaCelula.proxima = this.inicio; // faz a próxima referência da nova célula apontar para o inicio
        Celula atual = this.inicio; // a referência atual aponta para inicio
        
        atual = this.inicio.proxima; // a referência atual aponta para a próxima célula do deque
        
        while (atual.proxima != this.inicio){ //verifica se a próxima célula é o inicio, ou seja, atual está no fim do deque 
            atual = atual.proxima; // avança para a próxima célula
        }
        
        atual.proxima = novaCelula; //liga o final do deque com a nova célula
        novaCelula.anterior = atual; //liga a nova célula ao final do deque
        
        novaCelula.chave = chave; // insere a chave
        novaCelula.nome = nome; //insere o nome
        novaCelula.idade = idade; //insere a idade
        
        this.inicio = novaCelula; // muda a referência de início para a nova célula
        
        return this.inicio;
    }
    
    void imprimirDeque(Celula inicio){
        Celula atual = inicio;
        do{
            System.out.println("O valor da chave eh..: "+atual.getChave());
            System.out.println("O valor do nome eh..: "+atual.getNome());
            System.out.println("O valor da idade eh..: "+atual.getIdade());
            atual = atual.proxima;
        }while(atual.proxima != inicio);
    }
    
    void retiraDoInicio(Celula inicio){
        Celula atual = this.inicio.proxima;
        atual.setAnterior(this.inicio.anterior);
        atual = inicio.anterior;
        atual.setProxima(this.inicio.proxima);
        inicio = atual.proxima;
        
    }
}
